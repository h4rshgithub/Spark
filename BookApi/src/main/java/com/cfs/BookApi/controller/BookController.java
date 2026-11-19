package com.cfs.BookApi.controller;


import com.cfs.BookApi.entity.Book;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
    private HashMap<Long , Book> bookDb = new HashMap<>();

    private long  c = 1;

    @GetMapping
    public ResponseEntity<List<Book>> getAllBooks(){
        return ResponseEntity.ok(new ArrayList<>(bookDb.values()));
    }

    @PostMapping
    public ResponseEntity<Book> createBook(@RequestBody Book book){
        bookDb.put( book.getId() , book);
        return ResponseEntity.status(HttpStatus.CREATED).body(book);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Book> getBookById(@PathVariable Long id){
        Book book = bookDb.get(id);
        if(book != null){
            return ResponseEntity.ok(book);
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> updateBook(@PathVariable Long id , @RequestBody Book newBook){
        Book existing = bookDb.get(id);
        if(existing != null){
            bookDb.put(id , newBook);
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        }

        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }


    @PatchMapping("/{id}/price")
    public ResponseEntity<Book> updatePrice(@PathVariable Long id , @RequestBody Double newPrice){
        Book existing = bookDb.get(id);
        if(existing != null){
            existing.setPrice(newPrice);
            bookDb.put(id , existing);
            return ResponseEntity.ok(existing);
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBook(@PathVariable Long id ){
        Book book = bookDb.get(id);
        if(book != null){
            bookDb.remove(id);
            ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }
}
