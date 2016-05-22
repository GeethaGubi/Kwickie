package com.candidatetest.kwickie.retrofit;

/**
 * Created by geetha on 19/05/2016.
 */
public class LoginRequest {

    final String email;
    final String password;

    public LoginRequest(String email, String password) {
        this.email = email;
        this.password = password;
    }

}
