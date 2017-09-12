package com.reemii.com.testformvp;

/**
 * Created by huhanghao on 2017/9/12.
 */

public class UserBean {
    private String mFirstName;
    private String mLastName;
    public UserBean(String firstName, String lastName) {
        this. mFirstName = firstName;
        this. mLastName = lastName;
    }
    public String getFirstName() {
        return mFirstName;
    }
    public String getLastName() {
        return mLastName;
    }
}

