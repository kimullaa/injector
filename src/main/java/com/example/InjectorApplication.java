package com.example;

import com.example.exception.BusinessException;
import com.example.exception.ErrorCode;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InjectorApplication {

    public static void main(String[] args) {
        SpringApplication.run(InjectorApplication.class, args);
    }

    @Bean
    public CommandLineRunner execute() {
        return args -> {
            throw new BusinessException(ErrorCode.ACCOUNT_LOCKED);
        };
    }
}
