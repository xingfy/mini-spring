package org.springframework.minispring.context.support;

import org.springframework.minispring.beans.BeansException;
import org.springframework.minispring.beans.factory.ConfigurableListableBeanFactory;
import org.springframework.minispring.beans.factory.support.DefaultListableBeanFactory;

/**
 * @author xingfengyuan
 * @date 2021/7/15
 */
public abstract class AbstractRefreshableApplicationContext extends AbstractApplicationContext {

    private DefaultListableBeanFactory beanFactory;

    @Override
    protected void refreshBeanFactory() throws BeansException {
        DefaultListableBeanFactory beanFactory = createBeanFactory();
        loadBeanDefinitions(beanFactory);
        this.beanFactory = beanFactory;
    }

    private DefaultListableBeanFactory createBeanFactory() {
        return new DefaultListableBeanFactory();
    }

    protected abstract void loadBeanDefinitions(DefaultListableBeanFactory beanFactory);

    @Override
    protected ConfigurableListableBeanFactory getBeanFactory() {
        return beanFactory;
    }
}
