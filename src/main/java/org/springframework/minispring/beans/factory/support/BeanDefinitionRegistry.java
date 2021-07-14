package org.springframework.minispring.beans.factory.support;

import org.springframework.minispring.beans.factory.config.BeanDefinition;

/**
 * @author xingfengyuan
 * @date 2021/7/14
 */
public interface BeanDefinitionRegistry {

    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);
}
