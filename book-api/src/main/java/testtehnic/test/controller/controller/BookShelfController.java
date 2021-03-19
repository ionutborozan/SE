package testtehnic.test.controller.controller;


import org.springframework.web.multipart.MultipartFile;
import testtehnic.test.controller.model.BookModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import testtehnic.test.controller.service.BookShelfService;

import java.util.List;

@RestController
@RequestMapping("/book/")
public class BookShelfController {

    @Autowired
    private BookShelfService bookShelfService;


    @GetMapping(value = "get-all", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<BookModel> getAllBooks() {
        return bookShelfService.getAllBooks();
    }

    @PostMapping(value = "add-book", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void addBook(@RequestBody BookModel bookModel) {
        bookShelfService.addBook(bookModel);


    }

    @PutMapping(value = "edit-book", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void updateBook(@RequestBody BookModel bookModel) {
        this.bookShelfService.updateBook(bookModel);
    }

    @DeleteMapping(value = "delete-book")
    public void deleteBook(@RequestParam("id") String id) { this.bookShelfService.deleteBook(id); }
}
