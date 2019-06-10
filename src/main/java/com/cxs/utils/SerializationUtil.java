package com.cxs.utils;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @Author:chenxiaoshuang
 * @Date:2019/3/27 19:22
 * 手动序列化和反序列化
 */
public class SerializationUtil {

    /**
     * 正向序列化
     *
     * @return
     */
    public static byte[] inSerialization(Object object) {
        //获得一个字节输出流
        ByteArrayOutputStream byteArrayOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        byte[] bytes = null;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(object);
            bytes = byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //关闭流资源
            closeSource(objectOutputStream, byteArrayOutputStream);
        }
        return bytes;
    }

    /**
     * 反向序列化
     *
     * @param bytes
     * @return
     */
    public static Object deSerialization(byte[] bytes) {
        ByteArrayInputStream byteArrayInputStream = null;
        ObjectInputStream objectInputStream = null;
        Object object = null;
        try {
            byteArrayInputStream = new ByteArrayInputStream(bytes);
            objectInputStream = new ObjectInputStream(byteArrayInputStream);
            object = objectInputStream.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            closeSource(objectInputStream, byteArrayInputStream);
        }
        return object;
    }

    /**
     * 关闭资源
     *
     * @param closeable
     */
    public static void closeSource(AutoCloseable... closeable) {
        for (AutoCloseable closed : closeable) {
            if (closed != null) {
                try {
                    closed.close();
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    closed = null;
                }
            }
        }
    }

}
