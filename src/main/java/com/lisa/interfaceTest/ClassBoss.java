package com.lisa.interfaceTest;

/**
 * 模拟WeakCache类
 */
public class ClassBoss<K,P> {

    private InterfaceA a;
    private InterfaceA b;

    public ClassBoss(InterfaceA a,InterfaceA b){
        this.a = a;
        this.b = b;
    }

    public void get(K key,P parameter){
        System.out.println("get method--------start");
        a.apply();
        b.apply();
        System.out.println("get method--------end");
    }
}
