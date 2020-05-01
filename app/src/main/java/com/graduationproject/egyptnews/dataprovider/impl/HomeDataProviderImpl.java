package com.graduationproject.egyptnews.dataprovider.impl;

import com.graduationproject.egyptnews.dataprovider.HomeDataProvider;
import com.graduationproject.egyptnews.models.eeNews.News;
import com.graduationproject.egyptnews.webserrvices.HomeWebService;

import io.reactivex.Observable;
import io.reactivex.Single;
import retrofit2.http.Query;

public class HomeDataProviderImpl implements HomeDataProvider {

    HomeWebService homeWebServices;

    public HomeDataProviderImpl(HomeWebService homeWebServices) {
        this.homeWebServices = homeWebServices;
    }

    @Override
    public Single<News> getNews(@Query("key") String key, @Query("sort") String sort, @Query("cx") String cx,@Query("q") String q) {
        return homeWebServices.getNews(key,sort,cx,q);
    }
}
