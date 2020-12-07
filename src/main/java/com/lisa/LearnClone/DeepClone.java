package com.lisa.LearnClone;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class DeepClone {
	
	
	//ͨ����������л��ͷ����л�ʵ�ֿ�¡
	
	
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
        
        
        // ˵��������ByteArrayInputStream
        //��ByteArrayOutputStream�����close����û���κ�����
        // �����������ڴ����ֻҪ�������������������ܹ��ͷ���Դ��
        //��һ�㲻ͬ�ڶ��ⲿ��Դ�����ļ��������ͷ�
    }
}
