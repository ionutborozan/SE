package testtehnic.test.controller.service;

import testtehnic.test.controller.model.BookModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Service;
import testtehnic.test.controller.repository.BookRepository;

import java.util.List;

@Service
@EnableJpaRepositories
@EnableAutoConfiguration
public class BookShelfService {

    @Autowired
    private BookRepository repository;

    public List<BookModel> getAllBooks() {
       return this.repository.findAll();
    }

    public void addBook(BookModel bookModel) {
        this.repository.save(bookModel);
    }

    public void updateBook(BookModel bookModel) {
        this.repository.saveAndFlush(bookModel);
    }

    public void deleteBook(String id) {
        this.repository.deleteById(Integer.valueOf(id));
    }
}
