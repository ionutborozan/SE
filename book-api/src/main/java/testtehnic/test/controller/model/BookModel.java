package testtehnic.test.controller.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.*;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "books")
public class BookModel {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    private String ISBN;
    private String name;
    private String authors;
    private String annotation;

}
