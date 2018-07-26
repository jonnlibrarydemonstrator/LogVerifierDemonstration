package com.master.killercode.loginverifierdemonstration;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.master.killercode.loginverifier.ListActivity.UserModel;
import com.master.killercode.loginverifier.LoginVerifier;

public class Login extends AppCompatActivity {

    private Activity activity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        activity = Login.this;

        Button button = findViewById(R.id.btn);
        final EditText etLogin = findViewById(R.id.login);
        final EditText etUserName = findViewById(R.id.yourname);
        final EditText etPassword = findViewById(R.id.password);

        //=================================================================
        // init LoginVerifier
        //=================================================================

        final LoginVerifier loginVerifier = new LoginVerifier(activity);

        //=================================================================
        // get User's data, end add data in UserModel
        //=================================================================

        UserModel user = UserModel.getData(activity);

        String login = user.getUser();
        String pass = user.getPass();
        String userName = user.getUserName();

        ///////////////////////////////////////////////////////////////////

        if (login.equals("") || pass.equals("")) {
            /**
             *  if not has login data or not has password data, only set data in screen, for user
             */
            etLogin.setText(user.getUser());
            etUserName.setText(user.getUserName());
            etPassword.setText(user.getPass());

        } else {

            /**
             * if UserModel has login and pass saved, call login function automatically
             */
            loginVerifier.inLogin(userName, login, pass);

            Intent intent = new Intent(activity, UserActivity.class);
            startActivity(intent);
            finish();

        }

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (etLogin.getText().toString().trim().equals("")) {
                    Toast.makeText(Login.this, "type it your login please", Toast.LENGTH_SHORT).show();
                } else {

                    if (etUserName.getText().toString().trim().equals("")) {

                        //for not save name's user

                        /**
                         * 1° user's Login
                         * 2° user's Password
                         */
                        loginVerifier.inLogin(etLogin.getText().toString().trim(), etPassword.getText().toString().trim());

                    } else {

                        //for save all user's information

                        /**
                         * 1° user's Name
                         * 2° user's Login
                         * 3° user's Password
                         */

                        loginVerifier.inLogin(etUserName.getText().toString().trim(), etLogin.getText().toString().trim(), etPassword.getText().toString().trim());

                    }

                    Intent intent = new Intent(Login.this, UserActivity.class);
                    startActivity(intent);
                    finish();

//                    loginVerifier.inLogin(); // for not save user's informations
//                    loginVerifier.inLogin(etLogin.getText().toString().trim()); // for save only user's login information

                }
            }
        });


    }


}
