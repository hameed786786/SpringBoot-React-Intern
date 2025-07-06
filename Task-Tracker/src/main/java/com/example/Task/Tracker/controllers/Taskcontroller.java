package com.example.Task.Tracker.controllers;

import com.example.Task.Tracker.models.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.Task.Tracker.services.Taskservice;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class Taskcontroller {
    public Taskcontroller(){

    }
    @Autowired
    private Taskservice ts;

    @GetMapping
    public List<Task> gettasks(){
        return ts.gettaskdetails();
    }

    @GetMapping("/{id}")
    public Task gettasksbyid(@PathVariable int id){
        return ts.gettasksbyid(id);
    }

    @PostMapping
    public String postmethod(@RequestBody Task task){

        return ts.postmethod(task);
    }

    @PutMapping("/{id}")
    public String putmethod(@PathVariable int id,@RequestBody Task task){
        return ts.putmethod(id,task);
    }

    @DeleteMapping("/{id}")
    public String deletemethod(@PathVariable int id){
        return ts.deletemethod(id);
    }
}
