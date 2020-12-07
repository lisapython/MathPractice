package com.lisa.LearnContainers;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.function.Supplier;


public class ConcurrentMapTest<V,P,K> {

    //ConcurrentMap<Object, ConcurrentMap<Object, Supplier<V>>> map = new ConcurrentHashMap<>();

    public static void main(String[] args) {
        /*ConcurrentMap<Object, Supplier<Object>> valuesMap = new ConcurrentHashMap<>();
        valuesMap.put("1",new ConcurrentMap<Object, Supplier<V>>);
        Supplier<Object> supplier = valuesMap.get("1");*/

        ConcurrentMap<Object, ConcurrentMap<Object, Supplier<Object>>> map =null;;
        Object cacheKey=null;
        ConcurrentMap<Object, Supplier<Object>> valuesMap = null;
        ConcurrentMap<Object, Supplier<Object>> oldValuesMap = map.putIfAbsent(cacheKey, valuesMap = new ConcurrentHashMap<>());
    }
}


class SupplierTest implements Supplier{

    @Override
    public Object get() {
        return "aaaaaaaaa";
    }
}