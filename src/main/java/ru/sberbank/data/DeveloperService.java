package ru.sberbank.data;

import java.util.ArrayList;

public class DeveloperService {

    ArrayList<Developer> developers = new ArrayList<>();

    public DeveloperService(){

    }

    public boolean CreateDeveloper(String firstName, String secondName){
        if(firstName != null && firstName.isEmpty()){
            if (secondName == null && firstName.isEmpty()){
                return false;
            }
        }
        int id = (int)(1 + Math.random() * 10);
        boolean f = false;
        for(Developer d: developers){
            if(d.id == id){
                f = true;
            }
        }
        if(!f){
            Developer d = new Developer(id, firstName, secondName);
            developers.add(d);
            return true;
        }
        return false;
    }

    public Developer GetFreeDeveloper(){
        for(Developer d: developers){
            if(d.isFree == true){
                return d;
            }
        }
        return null;
    }
}
