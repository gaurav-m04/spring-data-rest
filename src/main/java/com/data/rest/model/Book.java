package com.data.rest.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Data
@Table(name = "books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String title;
    private String content;
    private String author;
    private Integer pages;


    /*
      @Data - annotation Lombok

      Contains :
       1. Getters and Setters
       2. toString() Method
       3. Equals and HashCode Methods
       4. No-args constructor and all-args constructor.
     */
}
