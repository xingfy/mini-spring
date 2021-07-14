package org.springframework.minispring.bean;

/**
 * @author xingfengyuan
 * @date 2021/7/14
 */
public class UserService {

    private String uid;

    private UserDao userDao;

    public String queryUserInfo() {
        System.out.println("查询用户信息: " + userDao.queryUserName(uid));
        return userDao.queryUserName(uid);
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
