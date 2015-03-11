package com.example.linpan1.myapplication;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;
import android.util.Log;

import com.avos.avoscloud.AVOSCloud;

import org.json.JSONObject;

/**
 * Created by linpan1 on 15/3/8.
 */
public class NotificationActivity extends BroadcastReceiver {

    public void onReceive(Context context, Intent intent) {
        try {         if (intent.getAction().equals("com.pushdemo.action")) {
            JSONObject json = new JSONObject(intent.getExtras().getString("com.avos.avoscloud.Data"));
            final String message = json.getString("alert");


            Intent resultIntent = new Intent(AVOSCloud.applicationContext, MainActivity.class);

            PendingIntent pendingIntent =
                    PendingIntent.getActivity(AVOSCloud.applicationContext, 0, resultIntent,
                            PendingIntent.FLAG_UPDATE_CURRENT);
            NotificationCompat.Builder mBuilder =
                    new NotificationCompat.Builder(AVOSCloud.applicationContext)
                            .setSmallIcon(R.drawable.exercise)
                            .setContentTitle(
                                    AVOSCloud.applicationContext.getResources().getString(R.string.app_name))
                            .setContentText(message)
                            .setTicker(message);
            mBuilder.setContentIntent(pendingIntent);
            mBuilder.setAutoCancel(true);

            int mNotificationId = 10086;
            NotificationManager mNotifyMgr =
                    (NotificationManager) AVOSCloud.applicationContext
                            .getSystemService(
                                    Context.NOTIFICATION_SERVICE);
            mNotifyMgr.notify(mNotificationId, mBuilder.build());

        }

        }
            catch(Exception e){
                Log.i("notif", "error");
            }





    }
}

