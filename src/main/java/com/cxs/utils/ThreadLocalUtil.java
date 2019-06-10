package com.cxs.utils;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author:chenxiaoshuang
 * @Date:2019/4/10 17:40
 */
public class ThreadLocalUtil {

    private static ThreadLocal<Map<String, Object>> threadLocal = new ThreadLocal<Map<String, Object>>() {
        @Override
        protected Map<String, Object> initialValue() {
            return new HashMap<>(16);
        }
    };

    public static void setVal(String name, Object value) {
        Map<String, Object> map = threadLocal.get();
        map.put(name, value);
    }

    public static Object getVal(String name) {
        Map<String, Object> map = threadLocal.get();
        Object o = map.get(name);
        return o;
    }

}
