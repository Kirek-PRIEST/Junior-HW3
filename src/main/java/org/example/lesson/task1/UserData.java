package org.example.lesson.task1;

import java.io.Serializable;

public class UserData implements Serializable {
    private String name;
    private int age;
    private transient String password;

    public UserData(int age, String name, String password) {
        this.age = age;
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return String.format("Имя = %s\n" +
                "Возраст = %s\n" +
                "Пароль = %s\n", this.name, this.age, this.password);
    }
}
