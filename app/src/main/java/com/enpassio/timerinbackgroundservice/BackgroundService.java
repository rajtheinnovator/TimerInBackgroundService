package com.enpassio.timerinbackgroundservice;

import android.app.IntentService;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.Nullable;
import android.util.Log;

/**
 * Created by ABHISHEK RAJ on 11/11/2017.
 */

public class BackgroundService extends IntentService {

    private static final String TAG = "BackgroundService";

    public BackgroundService() {
        super(TAG);
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        Log.v("my_tag", "onHandleIntent called");
        final Handler handler = new Handler(Looper.getMainLooper());
        final Runnable r = new Runnable() {
            public void run() {
                Log.v("my_tag", "tagggggg");
                handler.postDelayed(this, 1000);
            }
        };
        handler.postDelayed(r, 1000);
    }


}
