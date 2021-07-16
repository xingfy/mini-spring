package org.springframework.minispring.beans.factory.config;

import org.springframework.minispring.beans.BeansException;

/**
 * @author xingfengyuan
 * @date 2021/7/15
 */
public interface BeanPostProcessor {

    /**
     * 在bean对象执行初始化方法之前, 执行此方法
     *
     * @param bean     bean
     * @param beanName beanName
     * @return Object
     * @throws BeansException
     */
    Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException;

    /**
     * 在bean对象执行初始化方法之后, 执行此方法
     *
     * @param bean     bean
     * @param beanName beanName
     * @return Object
     * @throws BeansException
     */
    Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException;
}
