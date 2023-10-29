package com.data.rest.repository;

import com.data.rest.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Integer> {
    /*
      Note: To access the custom query method , will have to use search query.

      e.g.

     http://localhost:9090/administrator/api/books/search/findByAuthor{?author}

      http://localhost:9090/administrator/api/books/search/findByTitle{?title}

     http://localhost:9090/administrator/api/books/search/findByAuthorAndTitle{?author,title}

     */
    List<Book> findByTitle(String title);
    List<Book> findByAuthor(String author);

    List<Book> findByAuthorAndTitle(String author, String title);
}
