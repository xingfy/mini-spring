package org.springframework.minispring.beans.factory.config;

/**
 * 单例注册接口
 *
 * @author xingfengyuan
 * @date 2021/7/14
 */
public interface SingletonBeanRegistry {

    Object getSingleton(String beanName);
}
