package org.springframework.minispring.core.io;

/**
 * @author xingfengyuan
 * @date 2021/7/14
 */
public interface ResourceLoader {

    String CLASSPATH_URL_PREFIX = "classpath:";

    Resource getResource(String location);
}
