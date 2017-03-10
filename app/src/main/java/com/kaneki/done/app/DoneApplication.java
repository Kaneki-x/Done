package com.kaneki.done.app;

import android.app.Application;

/**
 * @author yueqian
 * @Desctription
 * @date 2017/3/10
 * @email yueqian@mogujie.com
 */
public class DoneApplication extends Application {

    private static DoneApplication INSTANCE = null;

    public static DoneApplication getInstance(){
        return INSTANCE;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        INSTANCE = this;
    }
}
