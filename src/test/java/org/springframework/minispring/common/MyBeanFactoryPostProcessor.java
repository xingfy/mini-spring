package org.springframework.minispring.common;

import org.springframework.minispring.beans.BeansException;
import org.springframework.minispring.beans.PropertyValue;
import org.springframework.minispring.beans.PropertyValues;
import org.springframework.minispring.beans.factory.ConfigurableListableBeanFactory;
import org.springframework.minispring.beans.factory.config.BeanDefinition;
import org.springframework.minispring.beans.factory.config.BeanFactoryPostProcessor;

/**
 * @author xingfengyuan
 * @date 2021/7/16
 */
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {

        BeanDefinition beanDefinition = beanFactory.getBeanDefinition("userService");
        PropertyValues propertyValues = beanDefinition.getPropertyValues();

        propertyValues.addPropertyValue(new PropertyValue("company", "改为: 字节跳动"));
    }
}
