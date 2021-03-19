package testtehnic.test.controller.repository;

import testtehnic.test.controller.model.BookModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<BookModel, Integer> {

}
