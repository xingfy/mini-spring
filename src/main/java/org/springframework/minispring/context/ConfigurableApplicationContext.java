package org.springframework.minispring.context;

import org.springframework.minispring.beans.BeansException;

/**
 * @author xingfengyuan
 * @date 2021/7/15
 */
public interface ConfigurableApplicationContext extends ApplicationContext {

    /**
     * 刷新容器
     *
     * @throws BeansException
     */
    void refresh() throws BeansException;

    void registerShutdownHook();

    void close();
}
