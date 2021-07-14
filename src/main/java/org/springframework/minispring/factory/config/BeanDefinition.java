package org.springframework.minispring.factory.config;

/**
 * 用于定义bean实例化信息
 *
 * @author xingfengyuan
 * @date 2021/7/14
 */
public class BeanDefinition {

    private Class beanClass;

    public BeanDefinition(Class beanClass) {
        this.beanClass = beanClass;
    }

    public Class getBeanClass() {
        return beanClass;
    }

    public void setBeanClass(Class beanClass) {
        this.beanClass = beanClass;
    }
}
