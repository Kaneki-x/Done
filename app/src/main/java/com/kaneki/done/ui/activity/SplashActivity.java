package com.kaneki.done.ui.activity;

import com.kaneki.done.R;
import com.kaneki.done.base.BaseActivity;
import com.kaneki.done.manager.ActivitySkipManager;

import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;
import io.reactivex.annotations.NonNull;
import io.reactivex.functions.Consumer;

/**
 * @author yueqian
 * @Desctription
 * @date 2017/3/10
 * @email yueqian@mogujie.com
 */
public class SplashActivity extends BaseActivity {

    @Override
    public int getContentView() {
        return R.layout.activity_splash;
    }

    @Override
    public void findViews() {

    }

    @Override
    public void initDatas() {

    }

    @Override
    public void initViews() {
        Observable.timer(3, TimeUnit.SECONDS).subscribe(new Consumer<Long>() {
            @Override
            public void accept(@NonNull Long aLong) throws Exception {
                ActivitySkipManager.getManager().skipActivity(SplashActivity.this, MainActivity.class);
            }
        });
    }

    @Override
    public void setListeners() {

    }

    @Override
    public void onEvent(Object object) {

    }
}
