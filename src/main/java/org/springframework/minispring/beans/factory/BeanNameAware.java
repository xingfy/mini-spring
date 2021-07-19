package org.springframework.minispring.beans.factory;

/**
 * @author xingfengyuan
 * @date 2021/7/19
 */
public interface BeanNameAware extends Aware{

    void setBeanName(String beanName);
}
