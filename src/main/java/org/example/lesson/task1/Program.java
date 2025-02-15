package org.example.lesson.task1;

import java.io.*;

public class Program {
    public static void main(String[] args) {
    UserData user = new UserData(13, "Ярослав", "12345");
        try(FileOutputStream fileOutputStream = new FileOutputStream("userdata.bin")) {
            ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);
            outputStream.writeObject(user);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (FileInputStream fileInputStream = new FileInputStream("userdata.bin")){
            ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);
            UserData exit = (UserData)inputStream.readObject();
            System.out.println(exit.toString());

        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


    }
}
