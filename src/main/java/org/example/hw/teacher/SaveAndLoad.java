package org.example.hw.teacher;

import java.io.*;

public class SaveAndLoad {
    private static int index = 1;

    public static void ser(Student student) {
        try(FileOutputStream fileOutputStream = new FileOutputStream("Student" + index + ".bin");){
            ObjectOutputStream objectOutput = new ObjectOutputStream(fileOutputStream);
            objectOutput.writeObject(student);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static Student deser(){
        try ( FileInputStream fileInputStream = new FileInputStream("Student" + index + ".bin")){
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            return (Student) objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
