package com.graduationproject.egyptnews.viewmodel.impl;

import com.graduationproject.egyptnews.dataprovider.HomeDataProvider;
import com.graduationproject.egyptnews.models.eeNews.News;
import com.graduationproject.egyptnews.viewmodel.HomeViewModel;

import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import retrofit2.http.Query;

public class HomeViewModelImpl implements HomeViewModel {

    HomeDataProvider homeRepo;

    public HomeViewModelImpl(HomeDataProvider homeRepo) {
        this.homeRepo = homeRepo;
    }

    @Override
    public Single<News> getNews(@Query("key") String key, @Query("sort") String sort, @Query("cx") String cx,@Query("q") String q){
        return homeRepo.getNews(key,sort,cx,q)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());
    }
}
