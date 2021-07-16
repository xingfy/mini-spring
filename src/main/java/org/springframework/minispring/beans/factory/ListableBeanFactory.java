package org.springframework.minispring.beans.factory;

import org.springframework.minispring.beans.BeansException;

import java.util.Map;

/**
 * @author xingfengyuan
 * @date 2021/7/15
 */
public interface ListableBeanFactory extends BeanFactory {

    /**
     * 按照类型返回Bean实例
     *
     * @param type type
     * @param <T>  T
     * @return
     * @throws BeansException
     */
    <T> Map<String, T> getBeansOfType(Class<T> type) throws BeansException;

    /**
     * 返回注册表中所有的Bean名称
     *
     * @return
     */
    String[] getBeanDefinitionNames();
}
