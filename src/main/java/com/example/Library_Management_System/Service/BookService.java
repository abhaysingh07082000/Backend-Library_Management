package com.example.Library_Management_System.Service;


import com.example.Library_Management_System.Models.Author;
import com.example.Library_Management_System.Models.Book;
import com.example.Library_Management_System.Repositories.AuthorRepository;
import com.example.Library_Management_System.Repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService
{

    @Autowired
    AuthorRepository authorRepository;

    public String createBook(Book book)
    {
        int authorId= book.getAuthor().getId();

        Author author=authorRepository.findById(authorId).get();


        book.setAuthor(author);


        List<Book>currentBooksWritten=author.getBooksWritten();
        currentBooksWritten.add(book);


        authorRepository.save(author);

        return "Book Added Successfully";

    }

}
