package com.reemii.com.testformvp;

/**
 * Created by huhanghao on 2017/9/12.
 */

public class UserPresenter {

    private IUserView mUserView;
    private IUserModel mUserModel;
    private UserBean user;

    public UserPresenter(IUserView view) {
        mUserView = view;
        mUserModel = new UserModel();
    }

    public void saveUser( int id, String firstName, String lastName) {
        mUserModel.setID(id);
        mUserModel.setFirstName(firstName);
        mUserModel.setLastName(lastName);
    }

    /**
     * 加载用户数据
     * @param id
     */
    public void loadUser( int id) {
        user = mUserModel.load(id);
        mUserView.setFirstName(user.getFirstName()); // 通过调用IUserView的方法来更新显示
        mUserView.setLastName(user.getLastName());
    }
}
