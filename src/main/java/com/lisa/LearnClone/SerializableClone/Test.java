package com.lisa.LearnClone.SerializableClone;

import java.util.ArrayList;
import java.util.List;

/**
 * 序列化和反序列化实现深克隆
 */
public class Test {
    public static void main(String[] args) {
        //多辆车的情况
        List<Car> carList = new ArrayList<Car>();
        Car car1 = new Car("BYD", "black");
        Car car2 = new Car("BMW", "red");
        Car car3 = new Car("Toyota", "white");
        carList.add(car1);
        carList.add(car2);
        carList.add(car3);

        //Person p1 = new Person("张三", 20, car);
        //张三年级轻轻就买了3台车
        Person p1 = new Person("张三", 20, carList);
        //张三的复制人张4
        Person p2 = CloneUtil.cloneObject(p1);

        //此处的输出证明反序列化实现深克隆成功
        System.out.println("P1:" + p1);//P1:Person [name=张三, age=20, car=Car [name=BYD, color=black]]
        System.out.println("p2:" + p2);//p2:Person [name=张三, age=20, car=Car [name=BYD, color=black]]


        if (p2 != null) {
            //张4喜欢蓝色的宝马
            carList.get(1).setColor("bule");
        }
        //此处的输出证明通过深克隆后P1和P2变成了两个相互独立的实例，互相不会影响。
        System.out.println("P1:" + p1);//P1:Person [name=张三, age=20, car=Car [name=宝马, color=red]]
        System.out.println("p2:" + p2);//p2:Person [name=张三, age=20, car=Car [name=BYD, color=black]]
    }
}
