package org.springframework.minispring;

import org.junit.Test;
import org.springframework.minispring.bean.UserService;
import org.springframework.minispring.factory.config.BeanDefinition;
import org.springframework.minispring.factory.support.DefaultListableBeanFactory;

/**
 * @author xingfengyuan
 * @date 2021/7/14
 */
public class ApiTest {

    /*
    @Test
    public void test_BeanFactory() {
        // 初始化BeanFactory
        BeanFactory beanFactory = new BeanFactory();

        // 注册bean
        BeanDefinition beanDefinition = new BeanDefinition(new UserService());
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        // 获取bean
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();
    }

     */

    /*
    @Test
    public void test_BeanFactory() {
        // 初始化BeanFactory
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        // 注册bean
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        // 第一次获取bean
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();

        // 第二次获取bean from singleton
        UserService userService_singleton = (UserService) beanFactory.getBean("userService");
        userService_singleton.queryUserInfo();
    }

     */

    @Test
    public void test_BeanFactory() {
        // 初始化BeanFactory
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        // 注入bean
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        // 获取bean
        UserService userService = (UserService) beanFactory.getBean("userService", "name2");
        userService.queryUserInfo();
    }
}
