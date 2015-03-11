package com.example.linpan1.myapplication;

import android.app.Application;

import com.avos.avoscloud.AVAnalytics;
import com.avos.avoscloud.AVCloud;
import com.avos.avoscloud.AVOSCloud;

/**
 * Created by linpan1 on 15/3/8.
 */
public class MainApp extends Application{
    public void onCreate(){
        super.onCreate();
        AVOSCloud.initialize(this,"9dli5b79onogi6ue80xvjr7fjk9hcjh7hv2wq6gkvola1mpl",
                "m98hxizt1cycyybzf1clfyvyodb6qa95k7rok5jy5svh1nx5");
        AVAnalytics.enableCrashReport(this.getApplicationContext(),true);
        AVOSCloud.setDebugLogEnabled(true);
    }
}
