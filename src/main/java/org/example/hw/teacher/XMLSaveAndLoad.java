package org.example.hw.teacher;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.File;
import java.io.IOException;

public class XMLSaveAndLoad {
    static XmlMapper mapper = new XmlMapper();
    static File file = new File("Student.xml");

    public static void save(Student student) {
        try {
            mapper.writeValue(file, student);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Student load() {

        try {
            return mapper.readValue(file, Student.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

}
