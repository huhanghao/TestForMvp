package com.reemii.com.testformvp;

/**
 * Created by huhanghao on 2017/9/12.
 */

public class UserModel implements IUserModel {

    @Override
    public void setID(int id) {

    }

    @Override
    public void setFirstName(String firstName) {

    }

    @Override
    public void setLastName(String lastName) {

    }

    @Override
    public int getID() {
        return 0;
    }

    @Override
    public UserBean load(int id) {
        String mID = "1";
        String mFirstName = "zi";
        String mLasttName = "jing";
        UserBean userBean = new UserBean(mFirstName,mLasttName);
        return userBean;
    }
}
