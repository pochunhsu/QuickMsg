package com.pchsu.quickmsg;

import android.app.Application;

import com.parse.Parse;

public class QuickMsgApplication extends Application{

    @Override
    public void onCreate(){
        super.onCreate();
        // connect to Parse
        Parse.enableLocalDatastore(this);
        Parse.initialize(this, "sNIhUtDvhjJLih6ntUhZPYiHfQmHI9wKI2bqvcNO", "sCJyX942ON9rxDdzlrem26VBRdifSV4Fz7MEGa9T");
    }
}
