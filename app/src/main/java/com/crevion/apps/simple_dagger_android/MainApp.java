package com.crevion.apps.simple_dagger_android;

import android.app.Application;

/**
 * Created by yusufaw on 1/31/18.
 */

public class MainApp extends Application {
    DiComponent diComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        diComponent = DaggerDiComponent.builder()
                .appModule(new AppModule(this))
                .build();
    }

    public DiComponent getDiComponent() {
        return diComponent;
    }
}
