package ru.sberbank;

import ru.sberbank.data.DeveloperService;
import ru.sberbank.data.Task;
import ru.sberbank.data.TaskService;
import ru.sberbank.data.TesterService;

import java.util.ArrayList;

public class Homework {

    public static void main(String[] args) {
//        TaskService ts = new TaskService();
//
//        System.out.println(ts.CreateTask("Задача 1"));
//        System.out.println(ts.CreateTask("Задача 2"));
//        System.out.println(ts.CreateTask("Задача 3"));
//        System.out.println(ts.CreateTask("Задача 4"));
//
//        System.out.println("----------------------------------");
//
//        ArrayList<Task> tasks = ts.GetTaskForDeveloping();
//
//        for(Task t: tasks){
//            System.out.println(t.toString());
//        }
//        System.out.println("----------------------------------");
//        System.out.println(ts.GetTask("Задача 1").toString());

//        DeveloperService developerService = new DeveloperService();
//
//        System.out.println(developerService.CreateDeveloper("Александр", "Кержаков"));
//        System.out.println(developerService.CreateDeveloper("Роман", "Широков"));
//        System.out.println(developerService.CreateDeveloper("Мигель", "Данни"));
//        System.out.println(developerService.CreateDeveloper("Константин", "Зырянов"));
//
//        System.out.println("----------------------------------");
//
//        System.out.println(developerService.GetFreeDeveloper().toString());

        TesterService testerService = new TesterService();

        System.out.println(testerService.CreateTester("Николас", "Ломбертс"));
        System.out.println(testerService.CreateTester("Сергей", "Семак"));
        System.out.println(testerService.CreateTester("Эрик", "Хаген"));
        System.out.println(testerService.CreateTester("Александр", "Анюков"));

        System.out.println("----------------------------------");

        System.out.println(testerService.GetTester("Эрик", "Хаген").toString());


        System.out.println("----------------------------------");

        System.out.println(testerService.GetFreeTesters().toString());
    }

}
