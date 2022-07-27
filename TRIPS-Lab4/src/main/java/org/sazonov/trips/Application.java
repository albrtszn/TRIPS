package org.sazonov.trips;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Bean;
import org.springframework.context.event.ContextRefreshedEvent;

import java.math.BigDecimal;

@Slf4j
@SpringBootApplication
@EnableAutoConfiguration
@EntityScan
public class Application {
    @Bean
    protected ApplicationListener<ContextRefreshedEvent> start() {
        return event -> {
            ApplicationContext ctx = event.getApplicationContext();
            {

            }
        };
    }
}
