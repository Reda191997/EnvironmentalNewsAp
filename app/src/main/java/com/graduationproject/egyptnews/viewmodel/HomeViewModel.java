package com.graduationproject.egyptnews.viewmodel;

import com.graduationproject.egyptnews.models.eeNews.News;

import io.reactivex.Observable;
import io.reactivex.Single;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface HomeViewModel {

    //Single<News> getNews(@Path("id") String competitionId);
    Single<News> getNews(@Query("key") String key, @Query("sort") String sort, @Query("cx") String cx,@Query("q") String q);

}
