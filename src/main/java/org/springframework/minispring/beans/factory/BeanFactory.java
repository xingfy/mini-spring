package org.springframework.minispring.beans.factory;

import org.springframework.minispring.beans.BeansException;

/**
 * 代表了bean对象的工厂，可以存放bean定义到Map中以及获取
 *
 * @author xingfengyuan
 * @date 2021/7/14
 */
public interface BeanFactory {

    /**
     * 获取bean
     *
     * @param name name
     * @return BeanDefinition
     */
    Object getBean(String name) throws BeansException;

    Object getBean(String name, Object... args) throws BeansException;
}
