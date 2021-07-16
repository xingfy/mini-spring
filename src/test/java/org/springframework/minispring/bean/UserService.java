package org.springframework.minispring.bean;

/**
 * @author xingfengyuan
 * @date 2021/7/14
 */
public class UserService {

    private String uid;

    private String company;

    private String location;

    private UserDao userDao;

    public String queryUserInfo() {
        System.out.println(
                "UserService{" +
                        "uid='" + uid + '\'' +
                        ", company='" + company + '\'' +
                        ", location='" + location + '\'' +
                        ", userDao=" + userDao +
                        '}');
        return userDao.queryUserName(uid);
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

}
