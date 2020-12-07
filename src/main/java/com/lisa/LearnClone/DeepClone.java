package com.lisa.LearnClone;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class DeepClone {
	
	
	//通过对象的序列化和反序列化实现克隆
	
	
	private DeepClone() {
        throw new AssertionError();
    }

	@SuppressWarnings("unchecked")
    public static <T extends Serializable> T clone(T obj)
                                  throws Exception {
        ByteArrayOutputStream bout = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bout);
        oos.writeObject(obj);
        ByteArrayInputStream bin = new ByteArrayInputStream(bout.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bin);
        return (T) ois.readObject();
        
        
        // 说明：调用ByteArrayInputStream
        //或ByteArrayOutputStream对象的close方法没有任何意义
        // 这两个基于内存的流只要垃圾回收器清理对象就能够释放资源，
        //这一点不同于对外部资源（如文件流）的释放
    }
}
