package com.aziztraders.mvparchticture.login.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.widget.Toast;

import com.aziztraders.mvparchticture.R;
import com.aziztraders.mvparchticture.databinding.ActivityLoginBinding;
import com.aziztraders.mvparchticture.login.presenter.ILoginPresenter;
import com.aziztraders.mvparchticture.login.presenter.LoginPresenterImpl;

public class LoginActivity extends AppCompatActivity implements ILoginView {

    /**
     * This class should extends view interface "ILoginView"
     * all the methods of its view will be implemented in this class

     * This view class should have an Object of presenter.
     * So it can give actions to perform to the presenter.
     */

    //presenter object
    private ILoginPresenter mPresenter;
    private ActivityLoginBinding mBinding;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_login);

        //initialising presenter
        createPresenter();

        //initialising Layout
        initLayout();
    }

    private void initLayout() {
        mBinding.idBtnLogin.setOnClickListener((v)->{
            mPresenter.startLogin(mBinding.idEdtUserName.getText().toString(),mBinding.idEdtPassword.getText().toString());
        });
    }

    private void createPresenter() {
        mPresenter =new LoginPresenterImpl(this);
    }

    @Override
    public void onLoginResult(String msg) {
        Toast.makeText(this,msg,Toast.LENGTH_SHORT).show();
    }
}