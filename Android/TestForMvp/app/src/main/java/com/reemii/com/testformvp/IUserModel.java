package com.reemii.com.testformvp;

/**
 * Created by huhanghao on 2017/9/12.
 */

public interface IUserModel {
    void setID(int id);

    void setFirstName(String firstName);

    void setLastName(String lastName);

    int getID();

    UserBean load(int id);// 通过id读取user信息,返回一个UserBean
}
