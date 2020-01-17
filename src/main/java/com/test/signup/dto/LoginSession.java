package com.test.signup.dto;

public class LoginSession {
    private static String user_no;

    public static String getUser_no()
    {
        return user_no;
    }

    public void setUser_no(String user_no)
    {
        LoginSession.user_no = user_no;
    }
}
