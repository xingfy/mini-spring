package org.springframework.minispring.beans.factory.support;

import org.springframework.minispring.beans.BeansException;
import org.springframework.minispring.core.io.Resource;
import org.springframework.minispring.core.io.ResourceLoader;

/**
 * @author xingfengyuan
 * @date 2021/7/14
 */
public interface BeanDefinitionReader {

    BeanDefinitionRegistry getRegistry();

    ResourceLoader getResourceLoader();

    void loadBeanDefinitions(Resource resource) throws BeansException;

    void loadBeanDefinitions(Resource... resources) throws BeansException;

    void loadBeanDefinitions(String location) throws BeansException;
}
