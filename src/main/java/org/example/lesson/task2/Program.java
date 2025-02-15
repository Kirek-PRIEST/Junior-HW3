package org.example.lesson.task2;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static org.example.lesson.task2.ToDoListApp.*;

public class Program {
    public static void main(String[] args) {
        List<ToDo> tasks;
        File f = new File(FILE_JSON);
        if (f.exists() && !f.isDirectory()){
            tasks = loadTaskFromFile(FILE_JSON);
        }else tasks = prepareList();
        ToDoListApp.saveTaskToFile(FILE_JSON, tasks);
        ToDoListApp.saveTaskToFile(FILE_BIN, tasks);
        ToDoListApp.saveTaskToFile(FILE_XML, tasks);

        displayTasks(tasks);
        Scanner scanner = new Scanner(System.in);
        while ((true)) {
            System.out.println("Выберете действие:");
            System.out.println("1. Добавить задачу");
            System.out.println("2. Отметить задачу выполненной");
            System.out.println("3. Выйти");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    ToDoListApp.addNewTask(scanner, tasks);
                    break;
                case "2":
                    ToDoListApp.markTaskAsDone(scanner, tasks);
                    break;
                case "3":
                    ToDoListApp.saveTaskToFile(FILE_JSON, tasks);
                    ToDoListApp.saveTaskToFile(FILE_BIN, tasks);
                    ToDoListApp.saveTaskToFile(FILE_XML, tasks);
                    System.out.println("Список задач сохранён.");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Некорректный выбор. Попробуйте ещё.");
                    break;
            }
            displayTasks(tasks);
        }
    }

    static List<ToDo> prepareList() {
        List<ToDo> list = new ArrayList<>();
        list.add(new ToDo("Задача 1"));
        list.add(new ToDo("Задача 2"));
        list.add(new ToDo("Задача 3"));
        return list;
    }
}
