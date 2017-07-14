package com.jerryzhang.rizh.mvpdemo.model;

import com.jerryzhang.rizh.mvpdemo.listener.OnLoginListener;

/**
 * Created by rizh on 7/14/2017.
 */

/**
 * 处理登录逻辑
 */
public interface LoginModel {
    void login(String userName, String password, OnLoginListener listener);
}
