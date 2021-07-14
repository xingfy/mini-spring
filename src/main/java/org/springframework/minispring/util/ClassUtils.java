package org.springframework.minispring.util;

/**
 * @author xingfengyuan
 * @date 2021/7/14
 */
public class ClassUtils {

    public static ClassLoader getDefaultClassLoader() {
        ClassLoader cl = null;

        try {
            cl = Thread.currentThread().getContextClassLoader();
        } catch (Throwable ex) {

        }

        if (cl == null) {
            cl = ClassUtils.class.getClassLoader();
        }

        return cl;
    }
}
