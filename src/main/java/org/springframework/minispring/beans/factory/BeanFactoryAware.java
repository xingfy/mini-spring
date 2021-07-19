package org.springframework.minispring.beans.factory;

import org.springframework.minispring.beans.BeansException;

/**
 * @author xingfengyuan
 * @date 2021/7/19
 */
public interface BeanFactoryAware extends Aware{

    void setBeanFactory(BeanFactory beanFactory) throws BeansException;
}
