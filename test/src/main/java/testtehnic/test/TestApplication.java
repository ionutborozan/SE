package testtehnic.test;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import testtehnic.test.controller.controller.BookShelfController;
import testtehnic.test.controller.model.BookModel;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import testtehnic.test.controller.service.BookShelfService;


@EnableJpaRepositories
@EnableConfigurationProperties
@SpringBootApplication(scanBasePackageClasses = {BookShelfController.class, BookModel.class, BookShelfService.class},
        scanBasePackages = "testtehnic.test")
public class TestApplication extends SpringBootServletInitializer {

    private static Class<TestApplication> application = TestApplication.class;

    public static void main(String[] args) {
        SpringApplication.run(TestApplication.class, args);
    }


    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(application);
    }

}
