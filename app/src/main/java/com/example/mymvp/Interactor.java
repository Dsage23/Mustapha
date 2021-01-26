package com.example.mymvp;

public interface Interactor {

    interface View{
        void onSuccess(String message);
        void onError(String message);
    }

    interface Presenter{
        void onLogin(String email, String password);
    }
}
