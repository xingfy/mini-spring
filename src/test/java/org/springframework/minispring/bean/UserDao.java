package org.springframework.minispring.bean;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xingfengyuan
 * @date 2021/7/14
 */
public class UserDao {

    private static Map<String, String> hashMap = new HashMap<>();

//    static {
//        hashMap.put("10001", "小妖");
//        hashMap.put("10002", "阿毛");
//        hashMap.put("10003", "八杯水");
//    }

    public void initDataMethod() {
        System.out.println("执行: init-method");
        hashMap.put("10001", "小妖");
        hashMap.put("10002", "阿毛");
        hashMap.put("10003", "八杯水");
    }

    public void destroyDataMethod() {
        System.out.println("执行: destroy-method");
        hashMap.clear();
    }

    public String queryUserName(String uid) {
        return hashMap.get(uid);
    }

}
