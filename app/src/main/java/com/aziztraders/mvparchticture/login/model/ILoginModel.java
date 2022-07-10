package com.aziztraders.mvparchticture.login.model;

public interface ILoginModel {
    String getPassword();

    String getEmail();

    boolean isValidData();
}
