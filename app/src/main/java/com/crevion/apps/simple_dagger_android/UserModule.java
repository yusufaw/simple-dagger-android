package com.crevion.apps.simple_dagger_android;

import com.crevion.apps.simple_dagger_android.models.User;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by yusufaw on 1/31/18.
 */

@Module
public class UserModule {
    @Provides
    @Singleton
    public UserService provideUserService() {
        return new UserService(new User());
    }
}
