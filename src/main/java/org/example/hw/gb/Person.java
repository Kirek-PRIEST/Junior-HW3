package org.example.hw.gb;

import java.io.Serializable;

public class Person implements Serializable {
     String name;
     int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("Имя = %s\n" +
                "Возраст = %s", name, age);
    }
}
