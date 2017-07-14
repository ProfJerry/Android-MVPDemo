package com.jerryzhang.rizh.mvpdemo.view;

/**
 * Created by rizh on 7/14/2017.
 */

/**
 * 主要抽象登录界面从界面上而言应该具有哪些功能
 */
public interface ILoginView {

    String getUserName();
    String getPassword();

    //如果是涉及耗时操作，为了用户体验，可能需要Progressbar
    void showProgress();
    void hideProgress();

    //用户登陆情况提示
    void showErrorToast();
    void showSuccessToast();
}
