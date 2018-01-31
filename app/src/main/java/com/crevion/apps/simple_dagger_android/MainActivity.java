package com.crevion.apps.simple_dagger_android;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    UserService userService;

    @Inject
    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((MainApp) getApplication()).getDiComponent().inject(this);

        userService.addNewUser("1", "Fio", "Smith");
        sharedPreferences.edit().putString(userService.getUser().getId(), userService.getUser().toString()).apply();
        TextView textView = findViewById(R.id.text);
        textView.setText("New User Inserted : " + sharedPreferences.getString(userService.getUser().getId(), ""));
    }
}
