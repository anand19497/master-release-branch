package com.Anandcode.demoforRestcurd.rest;

import com.Anandcode.demoforRestcurd.Entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class studentController {
   public  List<Student> myStudent;
    @PostConstruct
    public void loadValue(){

         myStudent=new ArrayList<>();
        myStudent.add(new Student("Anand","Mishra"));
        myStudent.add(new Student("Prince","Mishra"));
    }


@GetMapping("/student")
    public List<Student>StudentMethod(){
        return myStudent;

    }
    @GetMapping("/student/{StudentId}")
    public Student getStudent(@PathVariable("StudentId") int id){
        return myStudent.get(id);

    }
}
