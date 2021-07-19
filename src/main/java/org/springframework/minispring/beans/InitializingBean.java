package org.springframework.minispring.beans;

/**
 * @author xingfengyuan
 * @date 2021/7/19
 */
public interface InitializingBean {

    void afterPropertiesSet() throws Exception;
}
