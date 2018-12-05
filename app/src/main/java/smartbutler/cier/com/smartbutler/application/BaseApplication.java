package smartbutler.cier.com.smartbutler.application;

import android.app.Application;

import com.tencent.bugly.crashreport.CrashReport;

import smartbutler.cier.com.smartbutler.utils.StaticClass;

public class BaseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        CrashReport.initCrashReport(getApplicationContext(), StaticClass.BUGLY_APP_ID, true);
    }
}
