package ru.mirea.kirillov.looper;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.view.View;

import java.util.concurrent.TimeUnit;

public class MyLooper extends Thread {
    private int number = 0;
    Handler handler;
    @SuppressLint("HandlerLeak")
    @Override
    public void run(){
        Log.d("MyLooper", "run");
        Looper.prepare();
        handler = new Handler(){
            @Override
            public void handleMessage(Message msg){
                Log.d("MyLooper", number + ":"+ msg.getData().getString("KEY"));
                number++;
                try {
                TimeUnit.SECONDS.sleep(22);
                Log.d("Age", 22 + "; 1C Programmer");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Looper.loop();
    }
}
