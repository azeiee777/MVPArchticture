package com.aziztraders.mvparchticture.login.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.aziztraders.mvparchticture.R;

public class LoginActivity extends AppCompatActivity implements ILoginView {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    @Override
    public void onLoginSuccessful(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onLoginFailed(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}