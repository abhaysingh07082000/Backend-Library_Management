package com.example.Library_Management_System.Service;

import com.example.Library_Management_System.Enums.CardStatus;
import com.example.Library_Management_System.Models.Card;
import com.example.Library_Management_System.Models.Student;
import com.example.Library_Management_System.Repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService
{




    @Autowired
    StudentRepository studentRepository;

    public String createStudent(Student student)
    {

        //when student is called to create card automatically created

        Card card=new Card();
        card.setCardStatus(CardStatus.ACTIVATED);
        card.setStudentVariableName(student);

        student.setCard(card);

//        studentRepository.save(student);

        studentRepository.save(student);
        return "Student and Card Added Successfully";
    }



}
