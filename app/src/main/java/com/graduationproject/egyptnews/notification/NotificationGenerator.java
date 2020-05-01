package com.graduationproject.egyptnews.notification;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;

import androidx.core.app.NotificationCompat;
import androidx.lifecycle.LiveData;

import com.graduationproject.egyptnews.R;
import com.graduationproject.egyptnews.models.headNews.NewsRoom;
import com.graduationproject.egyptnews.sessionmanager.SessionManager;
import com.graduationproject.egyptnews.viewmodel.NewsVM;
import com.graduationproject.egyptnews.views.activities.EntryActivity;
import com.graduationproject.egyptnews.views.activities.MainNewsActivity;

import java.util.List;

public class NotificationGenerator extends BroadcastReceiver {

    NewsVM newsVM;
    private LiveData<List<NewsRoom>> newsList = newsVM.getAllNews();

    @Override
    public void onReceive(Context context, Intent intent) {
        NotificationManager notificationManager = (NotificationManager) context.getSystemService(context.NOTIFICATION_SERVICE);

        Intent intent1 = new Intent(context, MainNewsActivity.class);
        Intent intent3 = new Intent(context, EntryActivity.class);

        SessionManager sessionManager = new SessionManager(context);
        if (sessionManager.checkUserSession()) {
            intent1.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);

            PendingIntent pendingIntent1 = PendingIntent.getActivity(context, 100, intent1, PendingIntent.FLAG_UPDATE_CURRENT);

            NotificationCompat.Builder builder1 = new NotificationCompat.Builder(context)
                    .setContentIntent(pendingIntent1)
                    .setLights(Color.BLUE, 500, 500);
            long[] pattern1 = {500, 500, 500, 500, 500, 500, 500, 500, 500};
            builder1.setVibrate(pattern1);
            builder1.setStyle(new NotificationCompat.InboxStyle());
            builder1.setContentTitle(newsList.getValue().get(0).getNewsTitle().toString())
                    .setContentText(newsList.getValue().get(0).getNewsDescription().toString())
                    .setSmallIcon(R.drawable.ic_gnews)
                    .setSound(Uri.parse("android.resource://" + context.getPackageName() + "/" + R.raw.notification))
                    .setAutoCancel(true);

            notificationManager.notify(100, builder1.build());
        } else {
            intent3.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            PendingIntent pendingIntent3 = PendingIntent.getActivity(context, 100, intent3, PendingIntent.FLAG_UPDATE_CURRENT);

            NotificationCompat.Builder builder3 = new NotificationCompat.Builder(context)
                    .setContentIntent(pendingIntent3)
                    .setLights(Color.BLUE, 500, 500);
            long[] pattern3 = {500, 500, 500, 500, 500, 500, 500, 500, 500};
            builder3.setVibrate(pattern3);
            builder3.setStyle(new NotificationCompat.InboxStyle());
            builder3.setContentTitle(newsList.getValue().get(0).getNewsTitle().toString())
                    .setContentText(newsList.getValue().get(0).getNewsDescription().toString())
                    .setSmallIcon(R.drawable.ic_gnews)
                    .setSound(Uri.parse("android.resource://" + context.getPackageName() + "/" + R.raw.notification))
                    .setAutoCancel(true);

            notificationManager.notify(100, builder3.build());
        }
    }
}
