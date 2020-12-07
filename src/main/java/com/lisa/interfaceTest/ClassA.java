package com.lisa.interfaceTest;

/**
 * 模拟Proxy类
 */
public class ClassA{

    private static final ClassBoss proxyClassCache = new ClassBoss(new KeyFactory(), new ProxyClassFactory());

    //KeyFactory
    private static final class KeyFactory implements InterfaceA{

        KeyFactory(){
            System.out.println("new KeyFactory");
        }
        @Override
        public void apply() {
            System.out.println("KeyFactory apply");
        }
    }

    //ProxyClassFactory
    private static final class ProxyClassFactory implements InterfaceA{
        ProxyClassFactory(){System.out.println("new ProxyClassFactory");}
        @Override
        public void apply() {
            System.out.println("ProxyClassFactory apply");
        }
    }

    public static void main(String[] args) {
        KeyFactory keyFactory = new KeyFactory();
        ProxyClassFactory proxyClassFactroy = new ProxyClassFactory();
        ClassBB classBB = new ClassBB();
        proxyClassCache.get(keyFactory, proxyClassFactroy);

    }
}

