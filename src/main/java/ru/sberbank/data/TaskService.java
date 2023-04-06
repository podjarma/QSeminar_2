package ru.sberbank.data;

import java.util.ArrayList;

public class TaskService {
    private ArrayList <Task> list;

    public TaskService(){
        list = new ArrayList<>();
    }

    public boolean CreateTask(String summary){
        if (summary == null && summary.isEmpty()){
            return false;
        }

        int id = (int)(1 + Math.random() * 10);
        boolean f = false;
        for(Task t: list){
            if(t.id == id){
                f = true;
            }
        }

        if(!f){
            Task task = new Task(id, summary);
            list.add(task);
            return true;
        }

        return false;
    }

    public Task GetTask(String summary){
        for(Task t: list){
            if(t.summary.equalsIgnoreCase(summary)){
                return t;
            }
        }
        return null;
    }

    public ArrayList <Task> GetTaskForDeveloping(){
        ArrayList <Task> forDevelopTasks = new ArrayList<>();
        for(Task t: list){
            if(t.isDeveloped == false){
                forDevelopTasks.add(t);
            }
        }
        return forDevelopTasks;
    }

}
