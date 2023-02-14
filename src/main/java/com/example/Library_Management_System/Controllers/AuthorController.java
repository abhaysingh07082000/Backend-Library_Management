package com.example.Library_Management_System.Controllers;


import com.example.Library_Management_System.Models.Author;
import com.example.Library_Management_System.Service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("author")
public class AuthorController {

    @Autowired
    AuthorService authorService;

    @PostMapping("/createAuthor")
    public String createAuthor(@RequestBody() Author author)
    {
        return authorService.createAuthor(author);
    }
}
