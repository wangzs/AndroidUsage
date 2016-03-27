package com.wangzs.android.netbase;

import com.wangzs.android.netbase.response.DribbleShotBean;

import java.io.IOException;
import java.util.Date;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.Observable;

/**
 * Created by wangzs on 2016/3/27.
 */
public class DribbbleService {
    private static final String BASE_URL = "https://api.dribbble.com/v1/";
    private static final String ACCESS_TOKEN = "9b8794067f62acd87346543c11ac3848cddb0ee9d21bd441579248dbb6caee12";


    public static Observable<DribbleShotBean[]> getShotList() {
        return new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build()
                .create(IDribbbleApi.class)
                .getShotList(null, null, null, null);
    }

    public static Call<DribbleShotBean[]> getShotListCall() throws IOException {
        return new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(IDribbbleApi.class)
                .getShotListCall(null, null, null, null);
    }


}
