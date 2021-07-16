package org.springframework.minispring.context.support;

import org.springframework.minispring.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.minispring.beans.factory.xml.XmlBeanDefinitionReader;

/**
 * @author xingfengyuan
 * @date 2021/7/15
 */
public abstract class AbstractXmlApplicationContext extends AbstractRefreshableApplicationContext{

    @Override
    protected void loadBeanDefinitions(DefaultListableBeanFactory beanFactory) {
        XmlBeanDefinitionReader beanDefinitionReader = new XmlBeanDefinitionReader(beanFactory, this);
        String[] configLocations = getConfigLocations();
        if (configLocations != null) {
            beanDefinitionReader.loadBeanDefinitions(configLocations);
        }
    }

    protected abstract String[] getConfigLocations();
}
