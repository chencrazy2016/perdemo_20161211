package com.fh.action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by Administrator on 2016/12/25.
 */
public class UserAction extends ActionSupport {
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {

        this.username = username;
    }

    public String getPassword() {

        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String login() throws Exception {

        System.out.println("Login.action99");

        if ("admin".equals(username) && "admin".equals(password))
            return "success";
        else
            return "error";

    }
}
