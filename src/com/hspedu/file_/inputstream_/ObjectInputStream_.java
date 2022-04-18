package com.hspedu.file_.inputstream_;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ObjectInputStream_ {
    public static void main(String[] args) throws Exception{
        String filePath = "/Applications/text01/data.dat";
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(filePath));

        System.out.println(objectInputStream.readInt());
        System.out.println(objectInputStream.readBoolean());
        System.out.println(objectInputStream.readChar());
        System.out.println(objectInputStream.readDouble());
        System.out.println(objectInputStream.readUTF());
        System.out.println(objectInputStream.readObject());
        objectInputStream.close();
    }
}
