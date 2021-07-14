package org.springframework.minispring.factory;

/**
 * @author xingfengyuan
 * @date 2021/7/14
 */
public class BeansException extends RuntimeException{

    public BeansException(String msg) {
        super(msg);
    }

    public BeansException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
