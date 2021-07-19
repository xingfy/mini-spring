package org.springframework.minispring.context;

import org.springframework.minispring.beans.BeansException;
import org.springframework.minispring.beans.factory.Aware;

/**
 * @author xingfengyuan
 * @date 2021/7/19
 */
public interface ApplicationContextAware extends Aware {

    void setApplicationContext(ApplicationContext applicationContext) throws BeansException;
}
