package com.example.mymvp;

public class Presenter implements Interactor.Presenter {

    public Presenter(Interactor.View view) {
        this.view = view;
    }

    Interactor.View view;

    @Override
    public void onLogin(String email, String password) {
        if (email.equals("ojomustapha77@gmail.com") && password.equals("ojo12345")){
            view.onSuccess("Successful");
        }else {
            view.onError("wrong email or password");
        }

    }
}
