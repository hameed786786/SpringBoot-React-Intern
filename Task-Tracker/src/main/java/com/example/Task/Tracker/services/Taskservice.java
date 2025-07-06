package com.example.Task.Tracker.services;

import com.example.Task.Tracker.models.Task;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class Taskservice {
    List<Task> ls = new ArrayList<>(
            Arrays.asList(new Task(1,"DSA","To Complete The Array,Recursion Concepts","On Progess"))
    );

    public List<Task> gettaskdetails(){
        return ls;
    }

    public Task  gettasksbyid(int id){
        int ind = 0;
        boolean flag = false;
        for(int i=0;i<ls.size();i++){
            if(id==ls.get(i).getId()){
                ind = i;
                flag=true;
            }

        }
        if(flag){
            return ls.get(ind);
        }
        return new Task();
    }


    public String postmethod(Task task) {
        ls.add(task);
        return "task added successfully";
    }

    public String putmethod(int id, Task updatedtask) {

        for(int i=0;i<ls.size();i++){
            if(ls.get(i).getId()==id){
                ls.set(i,updatedtask);
                return "updated successfully";
            }
        }
        return "task not found";

    }

    public String deletemethod(int id){
        for(int i=0;i<ls.size();i++){
            if(ls.get(i).getId()==id){
                ls.remove(i);
            }
        }
        return "deleted Suceessfully";
    }
}

