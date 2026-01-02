package com.shehan.Abstraction;

public class User {

    private String email;
    private String password;

    //Validation rules live inside the object
    //Object controls its own state
    public void setEmail(String email) {
        if (email.contains("@")) {
            this.email = email;
        }
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public void setPassword(String password) {
        if (password.length() >= 8) {
            this.password = password;
        }
    }
}
