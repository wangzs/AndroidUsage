package com.wangzs.android.androidusage.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.apkfuns.logutils.LogUtils;
import com.wangzs.android.androidusage.R;
import com.wangzs.android.netbase.DribbbleService;
import com.wangzs.android.netbase.response.DribbleShotBean;

import java.io.IOException;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import rx.Subscriber;
import rx.schedulers.Schedulers;

public class DribbleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dribble);


        getShotsRxjava();
        //getShotsCall();
    }


    private void getShotsRxjava() {
        DribbbleService.getShotList()
                .subscribeOn(Schedulers.io())
                .subscribe(new Subscriber<DribbleShotBean[]>() {
                    @Override
                    public void onCompleted() {
                        LogUtils.d("====> completed");
                    }

                    @Override
                    public void onError(Throwable e) {
                        LogUtils.e("====> error: %s", e.toString());
                    }

                    @Override
                    public void onNext(DribbleShotBean[] dribbleShotBeans) {
                        LogUtils.d("====> size: %d", dribbleShotBeans.length);
                    }
                });
    }

    private void getShotsCall() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    LogUtils.d("====> 0");
                    // 异步
                    DribbbleService.getShotListCall().enqueue(new Callback<DribbleShotBean[]>() {
                        @Override
                        public void onResponse(Call<DribbleShotBean[]> call, Response<DribbleShotBean[]> response) {
                            if (response.isSuccessful() && response.body() != null) {
                                LogUtils.d("====> asynchronous retrofit: %d", response.body().length);
                            }
                        }

                        @Override
                        public void onFailure(Call<DribbleShotBean[]> call, Throwable t) {
                            LogUtils.e("====> asynchronous retrofit error");
                        }
                    });

                    LogUtils.d("====> 1");
                    // 同步
                    DribbleShotBean[] result = DribbbleService.getShotListCall().execute().body();
                    LogUtils.d("====> synchronous retrofit %s", result != null ? ""+result.length : "ERROR");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }).start();

    }


}
