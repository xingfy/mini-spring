package org.springframework.minispring.factory.support;

import org.springframework.minispring.factory.BeansException;
import org.springframework.minispring.factory.config.BeanDefinition;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xingfengyuan
 * @date 2021/7/14
 */
public class DefaultListableBeanFactory extends AbstractAutowireCapableBeanFactory implements BeanDefinitionRegistry {

    private Map<String, BeanDefinition> beanDefinitionMap = new HashMap<>();

    @Override
    public void registerBeanDefinition(String beanName, BeanDefinition beanDefinition) {
        beanDefinitionMap.put(beanName, beanDefinition);
    }

    @Override
    protected BeanDefinition getBeanDefinition(String beanName) throws BeansException {
        BeanDefinition beanDefinition = beanDefinitionMap.get(beanName);
        if (beanDefinition == null) {
            throw new BeansException("No bean named" + beanName + "is defined");
        }

        return beanDefinition;
    }
}
