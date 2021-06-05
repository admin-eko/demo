package gb.demo.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("gb.demo")

public class ApplicationConfiguration {
@Bean
    public String testString() {
        return  "Test spring example";
    }

    }
