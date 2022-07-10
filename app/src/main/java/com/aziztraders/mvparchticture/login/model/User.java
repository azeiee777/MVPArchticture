package com.aziztraders.mvparchticture.login.model;

import android.text.TextUtils;
import android.util.Patterns;

public class User implements ILoginModel {

    String email, password;

    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public String loginResult() {
        String message;
        if(TextUtils.isEmpty(getEmail())){
            message = "Login Failed, Email should not be empty";
        }else if(!Patterns.EMAIL_ADDRESS.matcher(getEmail()).matches()){
            message = "Login Failed, please enter a valid email";
        }else if(TextUtils.isEmpty(getPassword())){
            message = "Login Failed, Password should not be empty";
        }else if(getPassword().length()<6){
            message = "Login Failed, your password should be greater than 6";
        }else {
            message = "Congrats! Login Successful";
        }
        return message;
    }
}
