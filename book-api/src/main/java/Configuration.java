import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@org.springframework.context.annotation.Configuration
@ComponentScan
@EnableAutoConfiguration
@EnableJpaRepositories
public class Configuration {
}
