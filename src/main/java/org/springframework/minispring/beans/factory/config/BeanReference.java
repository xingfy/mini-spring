package org.springframework.minispring.beans.factory.config;

/**
 * @author xingfengyuan
 * @date 2021/7/14
 */
public class BeanReference {

    private final String beanName;

    public BeanReference(String beanName) {
        this.beanName = beanName;
    }

    public String getBeanName() {
        return beanName;
    }
}
