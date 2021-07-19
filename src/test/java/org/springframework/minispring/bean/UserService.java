package org.springframework.minispring.bean;

import org.springframework.minispring.beans.BeansException;
import org.springframework.minispring.beans.DisposableBean;
import org.springframework.minispring.beans.InitializingBean;
import org.springframework.minispring.beans.factory.BeanClassLoaderAware;
import org.springframework.minispring.beans.factory.BeanFactory;
import org.springframework.minispring.beans.factory.BeanFactoryAware;
import org.springframework.minispring.beans.factory.BeanNameAware;
import org.springframework.minispring.context.ApplicationContext;
import org.springframework.minispring.context.ApplicationContextAware;

/**
 * @author xingfengyuan
 * @date 2021/7/14
 */
public class UserService implements InitializingBean, DisposableBean,
        BeanNameAware, BeanClassLoaderAware, ApplicationContextAware, BeanFactoryAware {

    private ApplicationContext applicationContext;

    private BeanFactory beanFactory;

    private String uid;

    private String company;

    private String location;

    private UserDao userDao;

    @Override
    public void destroy() throws Exception {
        System.out.println("执行: UserService.destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("执行: UserService.afterPropertiesSet");
    }

    @Override
    public void setBeanClassLoader(ClassLoader classLoader) {
        System.out.println("beanClassLoader: " + classLoader);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.beanFactory = beanFactory;
    }

    @Override
    public void setBeanName(String beanName) {
        System.out.println("beanName: " + beanName);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

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

    public ApplicationContext getApplicationContext() {
        return applicationContext;
    }

    public BeanFactory getBeanFactory() {
        return beanFactory;
    }
}
