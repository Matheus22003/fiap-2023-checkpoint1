package br.com.fiap.checkpoint;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("br.com.fiap.checkpoint")
public class CheckPointApplication {
    public static void main(String[] args) {
        SpringApplication.run(CheckPointApplication.class, args);
    }

}
