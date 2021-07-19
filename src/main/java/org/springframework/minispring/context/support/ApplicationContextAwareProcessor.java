package org.springframework.minispring.context.support;

import org.springframework.minispring.beans.BeansException;
import org.springframework.minispring.beans.factory.config.BeanPostProcessor;
import org.springframework.minispring.context.ApplicationContext;
import org.springframework.minispring.context.ApplicationContextAware;

/**
 * @author xingfengyuan
 * @date 2021/7/19
 */
public class ApplicationContextAwareProcessor implements BeanPostProcessor {

    private final ApplicationContext applicationContext;

    public ApplicationContextAwareProcessor(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof ApplicationContextAware) {
            ((ApplicationContextAware) bean).setApplicationContext(applicationContext);
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }
}
