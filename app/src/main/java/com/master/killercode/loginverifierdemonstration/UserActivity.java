package com.master.killercode.loginverifierdemonstration;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.master.killercode.loginverifier.LoginVerifier;

public class UserActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.useractivity);

        Button button = findViewById(R.id.btn);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //init LoginVerifier
                LoginVerifier log = new LoginVerifier(UserActivity.this);

                //finish session

                //1° login class or class after logout
                //not call StartIntent(), finish Automatically
                log.inLogout(Login.class);

                //or

                //only for logout and start intent manuality
//                log.inLogout();
            }
        });
    }
}
