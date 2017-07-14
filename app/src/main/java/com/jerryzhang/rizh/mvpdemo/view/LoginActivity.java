package com.jerryzhang.rizh.mvpdemo.view;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.jerryzhang.rizh.mvpdemo.R;
import com.jerryzhang.rizh.mvpdemo.presenter.LoginPresenter;
import com.jerryzhang.rizh.mvpdemo.presenter.OnLoginPresenterImpl;

/**
 * Created by rizh on 7/14/2017.
 */

public class LoginActivity extends Activity implements ILoginView {

    LoginPresenter loginPresenter;
    EditText etUserName, etPassword;
    ProgressBar progressBar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);
        progressBar  = (ProgressBar) findViewById(R.id.pb);
        etUserName = (EditText) findViewById(R.id.etUserName);
        etPassword = (EditText) findViewById(R.id.etPassword);
        findViewById(R.id.btnLogin).setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                if(loginPresenter!=null){
                    loginPresenter.login(getUserName(), getPassword());
                }
            }
        });
        loginPresenter = new OnLoginPresenterImpl(this);
    }

    @Override
    public String getUserName() {
        return etUserName.getText().toString().trim();
    }

    @Override
    public String getPassword() {
        return etPassword.getText().toString().trim();
    }

    @Override
    public void showProgress() {
        if(!progressBar.isShown()){
            progressBar.setVisibility(View.VISIBLE);
        }
    }

    @Override
    public void hideProgress() {
        if(progressBar.isShown()){
            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    @Override
    public void showErrorToast() {
        Toast.makeText(this, "login error", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showSuccessToast() {
        Toast.makeText(this, "login success", Toast.LENGTH_SHORT).show();
    }
}
