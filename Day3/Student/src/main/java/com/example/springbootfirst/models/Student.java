package com.example.springbootfirst.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Student {
    public Student() {

    }

    public String getStudentname() {
        return studentname;
    }

    public int getStudentage() {
        return studentage;
    }

    public String getStudentemail() {
        return studentemail;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }

    public void setStudentage(int studentage) {
        this.studentage = studentage;
    }

    public void setStudentemail(String studentemail) {
        this.studentemail = studentemail;
    }
    private int studentid;
    private String studentname;
    private int studentage;

    public void setStudentid(int studentid) {
        this.studentid = studentid;
    }

    public int getStudentid() {
        return studentid;
    }

    private String studentemail;

    public Student(int studentid,String name, int age, String mail) {
        this.studentage=age;
        this.studentname=name;
        this.studentemail=mail;
        this.studentid=studentid;

    }
}
