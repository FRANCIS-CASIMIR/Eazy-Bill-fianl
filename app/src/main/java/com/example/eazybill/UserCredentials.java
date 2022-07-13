package com.example.eazybill;

public class UserCredentials {
    private String UserName;
    private String Password;

    public UserCredentials(){

    }
    public UserCredentials(String userName, String password) {
        UserName = userName;
        Password = password;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }
}
