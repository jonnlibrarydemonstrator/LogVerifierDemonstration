package com.master.killercode.loginverifierdemonstration;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.master.killercode.loginverifier.LoginVerifier;

public class Splash extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        // init LoginVerier here
        final LoginVerifier log = new LoginVerifier(Splash.this);

        /**
         * 1° User's home page, if logged
         * 2° Login's activity, if not logged
         */
        log.getLogin(UserActivity.class, Login.class);

        /**
         * Or only verifie if logued
         *
         * 1° User's home page, if logged
         */

        // log.getLogin(UserActivity.class);
    }
}
