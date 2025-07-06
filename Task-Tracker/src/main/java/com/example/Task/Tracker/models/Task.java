package com.example.Task.Tracker.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Task {


     public Task() {

     }

     public int getId() {
          return id;
     }

     public void setId(int id) {
          this.id = id;
     }



     private int id;
     private String title;

     public void setTitle(String title) {
          this.title = title;
     }

     public void setTaskdescription(String taskdescription) {
          this.taskdescription = taskdescription;
     }

     public void setStatus(String status) {
          Status = status;
     }

     public String getTitle() {
          return title;
     }

     public String getTaskdescription() {
          return taskdescription;
     }

     public String getStatus() {
          return Status;
     }

     public Task(int i, String title, String taskdescription, String status) {
          this.id=i;
          this.title = title;
          this.taskdescription = taskdescription;
          this.Status = status;
     }

     private String taskdescription;


     private String Status;


}
