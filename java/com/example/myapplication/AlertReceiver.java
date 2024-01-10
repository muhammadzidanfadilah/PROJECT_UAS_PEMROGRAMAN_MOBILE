package com.example.myapplication;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;


public class AlertReceiver extends BroadcastReceiver {
    public static String NOTIFICATION_ID = "notification_id";
    public static String NOTIFICATION_TITLE = "notification_title";
    public static String NOTIFICATION_CONTENT = "notification_content";

    @Override
    public void onReceive(Context context, Intent intent) {
        // Tindakan yang akan diambil saat alarm dipicu
        // Di sini, Anda dapat menampilkan notifikasi atau menjalankan tugas tertentu.

    }
}
