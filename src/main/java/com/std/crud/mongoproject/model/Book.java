package com.std.crud.mongoproject.model;

import org.bson.codecs.pojo.annotations.BsonId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "Book")
  
// Class
public class Book {
  
    // Attributes
    @BsonId
    private int id;
    private String bookName;
    private String authorName;
}
