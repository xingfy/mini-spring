package org.springframework.minispring.beans.factory.support;

import org.springframework.minispring.beans.BeansException;
import org.springframework.minispring.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;

/**
 * @author xingfengyuan
 * @date 2021/7/14
 */
public interface InstantiationStrategy {

    Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor ctor, Object[] args) throws BeansException;
}
