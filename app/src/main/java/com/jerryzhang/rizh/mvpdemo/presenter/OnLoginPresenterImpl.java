package com.jerryzhang.rizh.mvpdemo.presenter;

import com.jerryzhang.rizh.mvpdemo.listener.OnLoginListener;
import com.jerryzhang.rizh.mvpdemo.view.ILoginView;

/**
 * Created by rizh on 7/14/2017.
 */

public class OnLoginPresenterImpl implements LoginPresenter, OnLoginListener {

    ILoginView view;


    public OnLoginPresenterImpl(ILoginView view){
        this.view = view;
    }


    @Override
    public void login(String userName, String password) {

    }


    @Override
    public void loginSuccess() {

    }

    @Override
    public void loginFail(String msg) {

    }
}
