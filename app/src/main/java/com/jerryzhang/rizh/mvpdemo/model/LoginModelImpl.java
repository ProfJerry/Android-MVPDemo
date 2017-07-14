package com.jerryzhang.rizh.mvpdemo.model;

import android.os.Handler;

import com.jerryzhang.rizh.mvpdemo.listener.OnLoginListener;

/**
 * Created by rizh on 7/14/2017.
 */

public class LoginModelImpl implements LoginModel {
    public static final String USER_NAME = "jerry";
    public static final String PASSWORD = "jerry";

    @Override
    public void login(final String userName, final String password, final OnLoginListener callbcak) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if(userName.equals(USER_NAME) && password.equals(PASSWORD)){
                    callbcak.loginSuccess();
                }else{
                    callbcak.loginFail("用户名或者密码不正确");
                }
            }
        }, 2000);
    }
}
