package com.aziztraders.mvparchticture.login.presenter;

import android.view.View;

import com.aziztraders.mvparchticture.login.model.User;
import com.aziztraders.mvparchticture.login.view.ILoginView;

public class LoginPresenterImpl implements ILoginPresenter {

    /**
     * Presenter class should implement its view.
     * And in this class, implementation of all methods of its interface "ILoginPresenter"
        will be done.
     * This presenter is a bridge between view and model.
     * Presenter will get Actions from view and update data of model.
        and after updating data and getting response from model,
        This presenter will update view.
     **/


    /**
     * in Presenter there should be an object of "View" and "Model".
     * So Presenter can connect with both when required.
     **/

    //View object
    ILoginView iLoginView;

    //initialising view Object
    public LoginPresenterImpl(ILoginView iLoginView) {
        this.iLoginView = iLoginView;
    }

    //method to start login
    @Override
    public void startLogin(String email, String password) {
        User user = new User(email, password);
        String loginRes = user.loginResult();
        iLoginView.onLoginResult(loginRes);
    }
}
