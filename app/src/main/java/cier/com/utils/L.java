package cier.com.utils;

import android.util.Log;

public class L {
    // 开关
    public static final boolean DEBUG = true;
    // TAG
    public static final String TAG = "SmartButler";

    public static void d(String text){
        if (DEBUG){
            Log.d(TAG,text);
        }
    }
    public static void i(String text){
        if(DEBUG){
            Log.i(TAG,text);
        }
    }

    public static void w(String text){
        if(DEBUG){
            Log.w(TAG,text);
        }
    }

    public static void e(String text){
        if(DEBUG){
            Log.e(TAG,text);
        }
    }
}
