package com.wangzs.android.netbase;

import com.wangzs.android.netbase.response.DribbleShotBean;

import java.util.Date;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by wangzs on 2016/3/27.
 */
interface IDribbbleApi {
    // https://en.wikipedia.org/wiki/List_of_HTTP_header_fields

    @Headers("Authorization: Bearer 9b8794067f62acd87346543c11ac3848cddb0ee9d21bd441579248dbb6caee12")
    @GET("shots")
    Observable<DribbleShotBean[]> getShotList(@Query("list") String list,  // animated、attachments、debuts、playoffs、rebounds、teams
                                              @Query("timeframe") String timeframe,    // week、month、year、ever
                                              @Query("date") Date date,    // format: YYYY-MM-DD
                                              @Query("sort") String sort);  // comments、recent、views

    // 非RxJava版本
    @Headers("Authorization: Bearer 9b8794067f62acd87346543c11ac3848cddb0ee9d21bd441579248dbb6caee12")
    @GET("shots")
    Call<DribbleShotBean[]> getShotListCall(@Query("list") String list,  // animated、attachments、debuts、playoffs、rebounds、teams
                                              @Query("timeframe") String timeframe,    // week、month、year、ever
                                              @Query("date") Date date,    // format: YYYY-MM-DD
                                              @Query("sort") String sort);  // comments、recent、views
}
