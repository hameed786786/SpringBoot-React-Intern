package com.example.springbootfirst.controllers;

import com.example.springbootfirst.models.Student;
import com.example.springbootfirst.models.Studentparentdetails;
import com.example.springbootfirst.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
    @Autowired
    private StudentService st;


   @GetMapping
    public List<Student> Studentdetails() {
       return st.getStudentdetails();
   }

   @GetMapping("/{id}")
   public Student Studentdetailbyid(@PathVariable int id){
    return st.getstudentdetailbyid(id);
   }


    @GetMapping("/parents")
    public List<Studentparentdetails> StudentParentsdetails() {
       return st.getStudentparentdetails();
    }

    @PutMapping("/{id}")
    public String updateStudent(@PathVariable int id, @RequestBody Student student) {
        return st.updatestudent(id,student);
    }

    @PostMapping
    public String addstudent(@RequestBody Student student){
        return st.addstudent(student);

    }
    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable int id) {
        return st.deletestudent(id);

    }

}
