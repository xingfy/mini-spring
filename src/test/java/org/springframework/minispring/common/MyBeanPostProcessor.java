package org.springframework.minispring.common;

import org.springframework.minispring.bean.UserService;
import org.springframework.minispring.beans.BeansException;
import org.springframework.minispring.beans.factory.config.BeanPostProcessor;

/**
 * @author xingfengyuan
 * @date 2021/7/16
 */
public class MyBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if ("userService".equals(beanName)) {
            UserService userService = (UserService) bean;
            userService.setLocation("改为：北京");
        }

        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {


        return bean;
    }
}
