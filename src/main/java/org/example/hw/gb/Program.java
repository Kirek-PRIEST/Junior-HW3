package org.example.hw.gb;

public class Program {
    public static void main(String[] args) {
        Person person = new Person("Оскар", 3);
        SaveLoad.serialising(person);
        SaveLoad.deserialising();
    }
}
