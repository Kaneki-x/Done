package com.kaneki.done.manager;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;

/**
 * @author yueqian
 * @Desctription
 * @date 2017/3/10
 * @email yueqian@mogujie.com
 */
public class ActivitySkipManager {

    private final String OPEN_ACTIVITY_KEY = "open_activity_key";

    private static ActivitySkipManager manager;

    private static Intent intent;

    private ActivitySkipManager() {
        intent = new Intent();
    }

    public static ActivitySkipManager getManager() {
        if (manager == null) {
            synchronized (ActivitySkipManager.class) {
                if (manager == null) {
                    manager = new ActivitySkipManager();
                }
            }
        }
        return manager;
    }

    /**
     * 获取上一个界面传递过来的参数
     *
     * @param activity this
     * @param <T>      泛型
     * @return
     */
    public <T> T getParcelableExtra(Activity activity) {
        Parcelable parcelable = activity.getIntent().getParcelableExtra(OPEN_ACTIVITY_KEY);
        return (T) parcelable;
    }

    /**
     * 启动一个Activity
     *
     * @param _this
     * @param _class
     */
    public void skipActivity(Context _this, Class<? extends Activity> _class) {
        intent.setClass(_this, _class);
        _this.startActivity(intent);
    }

    /**
     *
     * @param _this
     * @param _class
     * @param parcelable
     */
    public void skipActivity(Context _this, Class<? extends Activity> _class, Parcelable parcelable) {
        intent.setClass(_this, _class);
        putParcelable(parcelable);
        _this.startActivity(intent);
    }

    /**
     * 启动一个Activity
     * @param _this
     * @param _class
     * @param flags
     * @param parcelable 传递的实体类
     */
    public void skipActivity(Context _this, Class<? extends Activity> _class, int flags, Parcelable parcelable) {
        intent.setClass(_this, _class);
        setFlags(flags);
        putParcelable(parcelable);
        _this.startActivity(intent);
    }

    /**
     * 启动activity后kill前一个
     *
     * @param _this
     * @param _class
     */
    public void skipActivityAndKill(Context _this, Class<? extends Activity> _class) {
        intent.setClass(_this, _class);
        _this.startActivity(intent);
        ((Activity) _this).finish();
    }

    public void skipActivityAndKill(Context _this, Class<? extends Activity> _class, Parcelable parcelable) {
        intent.setClass(_this, _class);
        putParcelable(parcelable);
        _this.startActivity(intent);
        ((Activity) _this).finish();
    }

    public void skipActivityAndKill(Context _this, Class<? extends Activity> _class, int flags, Parcelable parcelable) {
        intent.setClass(_this, _class);
        setFlags(flags);
        putParcelable(parcelable);
        _this.startActivity(intent);
        ((Activity) _this).finish();
    }

    public void skipActivityForResult(Activity _this, Class<? extends Activity> _class, int requestCode) {
        intent.setClass(_this, _class);
        _this.startActivityForResult(intent, requestCode);
    }

    public void skipActivityForResult(Activity _this, Class<? extends Activity> _class, Parcelable parcelable, int requestCode) {
        intent.setClass(_this, _class);
        putParcelable(parcelable);
        _this.startActivityForResult(intent, requestCode);
    }

    public void skipActivityForResult(Activity _this, Class<? extends Activity> _class, int flags, Parcelable parcelable, int requestCode) {
        intent.setClass(_this, _class);
        putParcelable(parcelable);
        setFlags(flags);
        _this.startActivityForResult(intent, requestCode);
    }

    public void skipActivityForResultAndKill(Activity _this, Class<? extends Activity> _class, int requestCode) {
        intent.setClass(_this, _class);
        _this.startActivityForResult(intent, requestCode);
        _this.finish();
    }

    public void skipActivityForResultAndKill(Activity _this, Class<? extends Activity> _class, Parcelable parcelable, int requestCode) {
        intent.setClass(_this, _class);
        putParcelable(parcelable);
        _this.startActivityForResult(intent, requestCode);
        _this.finish();
    }

    public void skipActivityForResultAndKill(Activity _this, Class<? extends Activity> _class, int flags, Parcelable parcelable, int requestCode) {
        intent.setClass(_this, _class);
        putParcelable(parcelable);
        setFlags(flags);
        _this.startActivityForResult(intent, requestCode);
        _this.finish();
    }

    private void setFlags(int flags) {
        if (flags < 0) return;
        intent.setFlags(flags);
    }

    private void putParcelable(Parcelable parcelable) {
        if (parcelable == null) return;
        intent.putExtra(OPEN_ACTIVITY_KEY, parcelable);
    }
}
