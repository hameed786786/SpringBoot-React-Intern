package com.example.springbootfirst.services;

import com.example.springbootfirst.models.Student;
import com.example.springbootfirst.models.Studentparentdetails;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Service
public class StudentService {
    List<Student> std = new ArrayList<>(
            Arrays.asList(new Student(1,"Peer Mohideen Hameed A",20,"hameed@gmail.com"),new Student(2,"maharaja",20,"raja@gmail.com"))
    );


    public List<Student> getStudentdetails() {
        return std;
    }
    List<Studentparentdetails> stdp = new ArrayList<>(
            Arrays.asList(new Studentparentdetails("s.abdul majeeth","a.sulaihal parveen"),new Studentparentdetails("xxxxxxxx","yyyyyyyy"))
    );
    public List<Studentparentdetails> getStudentparentdetails() {
        return stdp;
    }

    public Student getstudentdetailbyid(int id) {
        int ind = 0;
        boolean flag = false;
        for(int i=0;i<std.size();i++){
            if(id==std.get(i).getStudentid()){
                ind = i;
                flag=true;
            }

        }
        if(flag){
            return std.get(ind);
        }
        return new Student();
    }


    public String updatestudent(int id, Student student) {
        for(int i=0;i<std.size();i++){
            if(std.get(i).getStudentid()==id){
                std.set(i,student);
                return "Student updated sucessfully";
            }
        }
        return "Student not found";
    }

    public String deletestudent(int id) {
        for(int i=0;i<std.size();i++){
            if(id==std.get(i).getStudentid()){
                std.remove(i);
            }

        }
        return "deleted successfully";
    }

    public String addstudent(Student student) {
        std.add(student);
        return "student added successfully";
    }
}
