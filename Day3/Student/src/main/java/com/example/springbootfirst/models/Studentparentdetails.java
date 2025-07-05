package com.example.springbootfirst.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Studentparentdetails {
    private String studentfathername;

    public String getStudentfathername() {
        return studentfathername;
    }

    public void setStudentfathername(String studentfathername) {
        this.studentfathername = studentfathername;
    }

    public void setStudentmothername(String studentmothername) {
        this.studentmothername = studentmothername;
    }

    public String getStudentmothername() {
        return studentmothername;
    }

    private String studentmothername;

    public Studentparentdetails(String fathername, String mothername) {
        this.studentfathername=fathername;
        this.studentmothername=mothername;
    }
}
