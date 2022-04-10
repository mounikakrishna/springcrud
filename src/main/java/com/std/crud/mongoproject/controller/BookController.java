package com.std.crud.mongoproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.std.crud.mongoproject.model.Book;
import com.std.crud.mongoproject.repository.BookRepo;

@RestController

//Class 
public class BookController {

 @Autowired
 private BookRepo repo;

 @PostMapping("/addBook")
 public ResponseEntity<String> saveBook(@RequestBody Book book){
     repo.save(book);
     
     return new ResponseEntity<String>("inseted", HttpStatus.OK);
 }

 @GetMapping("/findAllBooks")
 public List<Book> getBooks() {
     
     return repo.findAll();
 }

 @DeleteMapping("/delete/{id}")
 public String deleteBook(@PathVariable int id){
     repo.deleteById(id);
     
     return "Deleted Successfully";
 }

}
