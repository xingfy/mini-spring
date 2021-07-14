package org.springframework.minispring.factory.support;

import org.springframework.minispring.factory.config.BeanDefinition;

/**
 * @author xingfengyuan
 * @date 2021/7/14
 */
public interface BeanDefinitionRegistry {

    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);
}
