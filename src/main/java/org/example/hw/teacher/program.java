package org.example.hw.teacher;

public class program {


    public static void main(String[] args) {
        Student student = new Student("Ivan", 25, 15.8);
        SaveAndLoad.ser(student);
        System.out.println(SaveAndLoad.deser().toString());
        System.out.println("CPA не был сериализован, т.к. у него стоит модификатор \"transient\"");

        System.out.println();
        JasonSaveAndLoad.save(student);
        System.out.println("Json\n" + JasonSaveAndLoad.load());

        System.out.println();
        XMLSaveAndLoad.save(student);
        System.out.println(XMLSaveAndLoad.load().toString());
    }
}
