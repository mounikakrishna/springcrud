package com.std.crud.mongoproject.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.std.crud.mongoproject.model.Book;

public interface BookRepo extends MongoRepository<Book, Integer>  {

}
