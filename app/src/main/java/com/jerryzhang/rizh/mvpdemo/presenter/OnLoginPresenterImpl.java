package com.jerryzhang.rizh.mvpdemo.presenter;

import com.jerryzhang.rizh.mvpdemo.listener.OnLoginListener;
import com.jerryzhang.rizh.mvpdemo.model.LoginModel;
import com.jerryzhang.rizh.mvpdemo.model.LoginModelImpl;
import com.jerryzhang.rizh.mvpdemo.view.ILoginView;

/**
 * Created by rizh on 7/14/2017.
 */

public class OnLoginPresenterImpl implements LoginPresenter, OnLoginListener {

    ILoginView view;
    LoginModel loginModel;

    public OnLoginPresenterImpl(ILoginView view){
        this.view = view;
        loginModel = new LoginModelImpl();
    }


    @Override
    public void login(String userName, String password) {
        view.showProgress();
        if(userName!=null && password!=null){
            loginModel.login(userName, password, this);
        }
    }


    @Override
    public void loginSuccess() {
        view.hideProgress();
        view.showSuccessToast();
    }

    @Override
    public void loginFail(String msg) {
        view.hideProgress();
        view.showErrorToast();
    }
}
