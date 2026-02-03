package com.example.investment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * The main entry point for the Investment application.
 */
@SpringBootApplication
public class InvestmentApplication {

    /**
     * The main method that starts the Investment application.
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        SpringApplication.run(InvestmentApplication.class, args);
    }
}