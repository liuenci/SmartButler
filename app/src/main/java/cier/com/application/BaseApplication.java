package cier.com.application;

import android.app.Application;
import android.os.StrictMode;

import com.tencent.bugly.crashreport.CrashReport;

import cier.com.utils.StaticClass;
import cn.bmob.v3.Bmob;

public class BaseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        // 初始化Bugly
        CrashReport.initCrashReport(getApplicationContext(), StaticClass.BUGLY_APP_ID, true);
        //初始化Bmob
        Bmob.initialize(this, StaticClass.BMOB_APP_ID);
        StrictMode.VmPolicy.Builder builder = new StrictMode.VmPolicy.Builder();
        StrictMode.setVmPolicy(builder.build());
        builder.detectFileUriExposure();
    }
}
