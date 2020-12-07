package com.lisa.LearnSingleton;

import java.util.HashMap;
import java.util.Map;

/**
 * ʹ������ʵ�ֵ���ģʽ
 * @author lisadmin
 *
 */
public class SingletonManager {
	
	private static Map<String, Object> objMap = new HashMap<String, Object>();
	
	private SingletonManager(){ }
	
	//�����ֵ�������ע�뵽һ��ͳһ�Ĺ����࣬��ʹ��ʱ����key��ȡ�����Ӧ���͵Ķ���
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
