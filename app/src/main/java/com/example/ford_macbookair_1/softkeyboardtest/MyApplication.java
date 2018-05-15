package com.example.ford_macbookair_1.softkeyboardtest;

import android.app.Application;

import java.security.PublicKey;

public class MyApplication extends Application {

    private MainActivity mainActivity;


    @Override
    public void onCreate() {
        super.onCreate();
    }



    public void setMainActivity(MainActivity mainActivity){
        this.mainActivity = mainActivity;
    }

    public MainActivity getMainActivity(){
        return mainActivity;
    }

}
