package com.crevion.apps.simple_dagger_android;

import com.crevion.apps.simple_dagger_android.models.User;

/**
 * Created by yusufaw on 1/31/18.
 */

public class UserService {
    private User user;

    public UserService(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void addNewUser(String id, String firstName, String lastName) {
        user.setId(id);
        user.setFirstName(firstName);
        user.setLastName(lastName);
    }
}
