package org.springframework.minispring.factory.support;

import org.springframework.minispring.factory.BeansException;
import org.springframework.minispring.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;

/**
 * @author xingfengyuan
 * @date 2021/7/14
 */
public interface InstantiationStrategy {

    Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor ctor, Object[] args) throws BeansException;
}
