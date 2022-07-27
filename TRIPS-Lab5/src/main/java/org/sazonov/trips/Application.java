package org.sazonov.trips;


import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;

@Slf4j
@SpringBootApplication
@EnableAutoConfiguration
@EntityScan
@ComponentScan
public class Application
{
    public static void main( String[] args )
    {
        SpringApplication.run(Application.class,args);
    }

}
