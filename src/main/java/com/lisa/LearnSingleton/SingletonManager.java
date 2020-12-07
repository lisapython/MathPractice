package com.lisa.LearnSingleton;

import java.util.HashMap;
import java.util.Map;

/**
 * 使用容器实现单例模式
 * @author lisadmin
 *
 */
public class SingletonManager {
	
	private static Map<String, Object> objMap = new HashMap<String, Object>();
	
	private SingletonManager(){ }
	
	//将多种单例类型注入到一个统一的管理类，在使用时根据key获取对象对应类型的对象
    public static void registerService(String key, Object instance)
    {
        if(!objMap.containsKey(key)){
            objMap.put(key, instance);
        }
    }
    
    public static Object getService(String key){
        return objMap.get(key);
    }


}
