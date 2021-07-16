package org.springframework.minispring.beans.factory.config;

import org.springframework.minispring.beans.factory.HierarchicalBeanFactory;

/**
 * @author xingfengyuan
 * @date 2021/7/15
 */
public interface ConfigurableBeanFactory extends HierarchicalBeanFactory, SingletonBeanRegistry {

    String SCOPE_SINGLETON = "singleton";

    String SCOPE_PROTOTYPE = "prototype";

    void addBeanPostProcessor(BeanPostProcessor beanPostProcessor);
}
