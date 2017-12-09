package com.flowacademy.uszas.init;

import java.io.*;
import java.util.List;

public class MyInitPack {

    public static void serializeList(Object object, String serializePath) {
        try {
            FileOutputStream fileOut = new FileOutputStream(serializePath);
            ObjectOutputStream objOut = new ObjectOutputStream(fileOut);
            objOut.writeObject(object);
            objOut.close();
            fileOut.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Object> deSerializeList(String deSerializePath) {
        List<Object> list = null;
        try {
            FileInputStream fileIn = new FileInputStream(deSerializePath);
            ObjectInputStream objIn = new ObjectInputStream(fileIn);
            list = (List<Object>) objIn.readObject();
            objIn.close();
            fileIn.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return list;
    }

}
