package ru.sberbank.data;

import java.util.Objects;

public class Developer {
    Task currentTask;
    int id;
    boolean isFree;
    String firstName;
    String secondName;

    public Developer(int id, String firstName, String secondName) {
        this.id = id;
        this.isFree = true;
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public boolean equ(Developer d){
        if(this.id == d.id){
            if(this.firstName.equalsIgnoreCase(d.firstName) && this.secondName.equalsIgnoreCase(d.secondName)) {
                return true;
            }
        }
        return false;
    }

    public boolean addTask(Task task){
        if(this.isFree && this.currentTask == null){
            this.currentTask = task;
            this.isFree = false;
            return true;
        }
        return false;
    }

    public Task makeTask(){
        if(this.currentTask != null && this.isFree == false){
            this.currentTask.isDeveloped = true;
            this.isFree = true;
        }
        return null;
    }

    public void release(){
        this.currentTask = null;
        this.isFree = true;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "currentTask=" + currentTask +
                ", id=" + id +
                ", isFree=" + isFree +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                '}';
    }
}
