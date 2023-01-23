package ru.sberbank.data;

import java.util.Objects;

public class Developer {
    Task currentTask;
    int id;
    boolean isFree;

    public Developer(int id) {
        this.id = id;
        this.isFree = true;
    }

    boolean addTask(Task task){
        if(this.isFree && this.currentTask == null){
            this.currentTask = task;
            this.isFree = false;
            return true;
        }
        return false;
    }

    Task makeTask(){
        if(this.currentTask != null && this.isFree == false){
            this.currentTask.isDeveloped = true;
            this.isFree = true;
        }
        return null;
    }

    void release(){
        this.currentTask = null;
        this.isFree = true;
    }
}
