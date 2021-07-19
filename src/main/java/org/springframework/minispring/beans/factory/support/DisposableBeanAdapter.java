package org.springframework.minispring.beans.factory.support;

import cn.hutool.core.util.StrUtil;
import org.springframework.minispring.beans.BeansException;
import org.springframework.minispring.beans.DisposableBean;
import org.springframework.minispring.beans.factory.config.BeanDefinition;

import java.lang.reflect.Method;

/**
 * @author xingfengyuan
 * @date 2021/7/19
 */
public class DisposableBeanAdapter implements DisposableBean {

    private final Object bean;

    private final String beanName;

    private String destroyMethodName;

    public DisposableBeanAdapter(Object bean, String beanName, BeanDefinition beanDefinition) {
        this.bean = bean;
        this.beanName = beanName;
        this.destroyMethodName = beanDefinition.getDestroyMethodName();
    }

    @Override
    public void destroy() throws Exception {
        if (bean instanceof DisposableBean) {
            ((DisposableBean) bean).destroy();
        }

        if (StrUtil.isNotEmpty(destroyMethodName) && !(bean instanceof DisposableBean && "destroy".equals(this.destroyMethodName))) {
            Method destroyMethod = bean.getClass().getMethod(destroyMethodName);
            if (destroyMethod == null) {
                throw new BeansException("Couldn't find a destroy method named " + destroyMethodName + "on bean with name " + beanName);
            }
            destroyMethod.invoke(bean);
        }
    }
}
