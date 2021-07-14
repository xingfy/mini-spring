package org.springframework.minispring.core.io;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author xingfengyuan
 * @date 2021/7/14
 */
public interface Resource {

    InputStream getInputStream() throws IOException;
}
