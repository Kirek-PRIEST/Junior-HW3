package org.example.hw.gb;

import java.io.*;

public class SaveLoad {
    public static void serialising (Object o){
        try (FileOutputStream out = new FileOutputStream("person.txt")){
            ObjectOutputStream outputStream = new ObjectOutputStream(out);
            outputStream.writeObject(o);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void deserialising(){
        try {
            FileInputStream in = new FileInputStream("person.txt");
            ObjectInputStream inputStream = new ObjectInputStream(in);
            Person person = (Person)inputStream.readObject();
            System.out.println(person.toString());

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
