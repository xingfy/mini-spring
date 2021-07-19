package org.springframework.minispring.beans.factory.support;

import org.springframework.minispring.beans.BeansException;
import org.springframework.minispring.beans.DisposableBean;
import org.springframework.minispring.beans.factory.config.SingletonBeanRegistry;

import java.beans.Beans;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author xingfengyuan
 * @date 2021/7/14
 */
public class DefaultSingletonBeanRegistry implements SingletonBeanRegistry {

    private Map<String, Object> singletonObjects = new HashMap<>();

    private final Map<String, DisposableBean> disposableBeans = new HashMap<>();

    @Override
    public Object getSingleton(String beanName) {
        return singletonObjects.get(beanName);
    }

    protected void addSingleton(String beanName, Object singletonObject) {
        singletonObjects.put(beanName, singletonObject);
    }

    public void registerDisposableBean(String beanName, DisposableBean bean) {
        disposableBeans.put(beanName, bean);
    }

    public void destroySingletons() {
        Set<String> keySet = this.disposableBeans.keySet();
        Object[] disposableBeanNames = keySet.toArray();

        for (int i = disposableBeanNames.length - 1; i >= 0; i--) {
            Object beanName = disposableBeanNames[i];
            DisposableBean disposableBean = disposableBeans.remove(beanName);

            try {
                disposableBean.destroy();
            } catch (Exception e) {
                throw new BeansException("Destroy method on bean with name " + beanName + "throw an exception", e);
            }
        }
    }
}
