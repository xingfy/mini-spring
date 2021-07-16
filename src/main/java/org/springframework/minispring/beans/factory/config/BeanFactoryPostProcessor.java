package org.springframework.minispring.beans.factory.config;

import org.springframework.minispring.beans.BeansException;
import org.springframework.minispring.beans.factory.ConfigurableListableBeanFactory;

/**
 * @author xingfengyuan
 * @date 2021/7/15
 */
public interface BeanFactoryPostProcessor {

    void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException;
}
