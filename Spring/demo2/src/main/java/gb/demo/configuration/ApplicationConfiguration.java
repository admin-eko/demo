package gb.demo.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

public class ApplicationConfiguration {
    @Configuration
    @ComponentScan("gb.demo")
}
