package com.example.runtimepermissiontest;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.sax.StartElementListener;
import android.util.Log;
import android.widget.Toast;

import static android.content.ContentValues.TAG;

public class BootCompleted extends BroadcastReceiver {

    public void onReceive(Context context, Intent intent) {
        Intent intent1 = new Intent(context,MainActivity.class);
         //*********添加一个Activity启动模式
            intent1.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(intent1);
        }
    }

