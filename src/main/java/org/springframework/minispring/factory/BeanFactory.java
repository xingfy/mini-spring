package org.springframework.minispring.factory;

import org.springframework.minispring.factory.config.BeanDefinition;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

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
