package org.example.hw.teacher;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.File;
import java.io.IOException;

public class JasonSaveAndLoad {
    private static final ObjectMapper om = new ObjectMapper();

static {om.configure(SerializationFeature.INDENT_OUTPUT, true);}
    public static void save(Student student){
        try {

            om.writeValue(new File("Student.json"), student);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static Student load(){
    Student student = new Student();
    File file = new File("Student.json");
        try {
            student = om.readValue(file, Student.class);
            return student;

        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }



}
