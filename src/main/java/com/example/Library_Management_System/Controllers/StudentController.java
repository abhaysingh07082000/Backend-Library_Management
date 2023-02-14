package com.example.Library_Management_System.Controllers;


import com.example.Library_Management_System.Enums.CardStatus;
import com.example.Library_Management_System.Models.Card;
import com.example.Library_Management_System.Models.Student;
import com.example.Library_Management_System.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("student")
public class StudentController
{

    //this layer is used for making Rest Apis
     @Autowired
     StudentService studentService;

     @PostMapping("/createStudent")
     public String createStudent(@RequestBody Student student)
     {
         return studentService.createStudent(student);
     }
}
