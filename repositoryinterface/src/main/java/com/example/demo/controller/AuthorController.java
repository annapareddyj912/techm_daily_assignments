package com.example.demo.controller;

import com.example.demo.model.Author;
import com.example.demo.model.Book;
import com.example.demo.repository.AuthorRepository;
import com.example.demo.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/authors")
public class AuthorController {

    @Autowired
    private AuthorRepository authorRepository;

    @Autowired
    private BookRepository bookRepository;

    @GetMapping
    public List<Author> getAllAuthors() {
        return authorRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Author> getAuthorById(@PathVariable Long id) {
        return authorRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Author createAuthor(@RequestBody Author author) {
        return authorRepository.save(author);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Author> updateAuthor(@PathVariable Long id, @RequestBody Author authorDetails) {
        return authorRepository.findById(id)
                .map(author -> {
                    author.setName(authorDetails.getName());
                    return ResponseEntity.ok(authorRepository.save(author));
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAuthor(@PathVariable Long id) {
        return authorRepository.findById(id)
                .map(author -> {
                    authorRepository.delete(author);
                    return ResponseEntity.noContent().build();
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping("/{authorId}/books")
    public ResponseEntity<Author> addBookToAuthor(@PathVariable Long authorId, @RequestBody Book book) {
        return authorRepository.findById(authorId)
                .map(author -> {
                    author.addBook(book);
                    authorRepository.save(author);
                    return ResponseEntity.ok(author);
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{authorId}/books/{bookId}")
    public ResponseEntity<Author> removeBookFromAuthor(@PathVariable Long authorId, @PathVariable Long bookId) {
        return authorRepository.findById(authorId)
                .map(author -> {
                    Optional<Book> book = bookRepository.findById(bookId);
                    book.ifPresent(author::removeBook);
                    authorRepository.save(author);
                    return ResponseEntity.ok(author);
                })
                .orElse(ResponseEntity.notFound().build());
    }
}
