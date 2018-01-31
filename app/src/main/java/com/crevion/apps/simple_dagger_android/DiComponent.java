package com.crevion.apps.simple_dagger_android;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by yusufaw on 1/31/18.
 */

@Singleton
@Component(modules = {AppModule.class, UserModule.class})
public interface DiComponent {
    void inject(MainActivity mainActivity);
}
