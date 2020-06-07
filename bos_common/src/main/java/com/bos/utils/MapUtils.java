package com.bos.utils;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapUtils {

    public static Map<String, Object> parseParamMapToMyBatisMap(Map<String, Object> paramMap) {
        Map<String, Object> resultMap = new HashMap<String, Object>();
        Set<Map.Entry<String, Object>> entries = paramMap.entrySet();
        for (Map.Entry<String, Object> entry : entries) {
            String key = entry.getKey();
            Object value = entry.getValue();
            resultMap.put(key,value);
        }
        return resultMap;
    }
}
