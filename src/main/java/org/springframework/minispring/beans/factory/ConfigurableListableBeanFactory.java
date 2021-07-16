package org.springframework.minispring.beans.factory;

import org.springframework.minispring.beans.BeansException;
import org.springframework.minispring.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.minispring.beans.factory.config.BeanDefinition;
import org.springframework.minispring.beans.factory.config.BeanPostProcessor;
import org.springframework.minispring.beans.factory.config.ConfigurableBeanFactory;

/**
 * @author xingfengyuan
 * @date 2021/7/15
 */
public interface ConfigurableListableBeanFactory extends ListableBeanFactory, AutowireCapableBeanFactory, ConfigurableBeanFactory {

    BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    void preInstantiateSingletons() throws BeansException;

    void addBeanPostProcessor(BeanPostProcessor beanPostProcessor);
}
