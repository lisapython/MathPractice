package com.lisa.LearnClone.SerializableClone;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * 工具类：使用序列化和反序列化实现对象的克隆
 */
public class CloneUtil {
    private CloneUtil() {
    }

    @SuppressWarnings("unchecked")
    public static <T extends Serializable> T cloneObject(T obj) {
        T cloneObj = null;

        // 序列化
        ByteArrayOutputStream bout = null;
        ObjectOutputStream oos = null;
        try {
            bout = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bout);
            oos.writeObject(obj);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            close(oos);
            close(bout);
        }

        // 反序列化
        ByteArrayInputStream bin = null;
        ObjectInputStream ois = null;
        try {
            bin = new ByteArrayInputStream(bout.toByteArray());
            ois = new ObjectInputStream(bin);
            cloneObj = (T) ois.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch(ClassNotFoundException ex){
            ex.printStackTrace();
        }finally {
            close(ois);
            close(bin);
        }

        return cloneObj;
    }

    private static void close(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}