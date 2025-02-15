package org.example.hw.teacher;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;

public class Student implements Serializable {

    private String name;
    private int age;
    @JsonIgnore
    private transient double cpa;

    public Student(String name, int age, double cpa) {
        this.name = name;
        this.age = age;
        this.cpa = cpa;
    }

    public Student() {

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getCpa() {
        return cpa;
    }

    @Override
    public String toString() {
        return String.format("Имя = %s\n" +
                "Возраст = %s\n" +
                "CPA = %s", name, age, cpa);
    }
}
