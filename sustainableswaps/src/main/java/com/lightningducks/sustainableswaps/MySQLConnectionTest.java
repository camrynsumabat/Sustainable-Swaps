package com.lightningducks.sustainableswaps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class MySQLConnectionTest implements CommandLineRunner {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public static void main(String[] args) {
        SpringApplication.run(MySQLConnectionTest.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        // do an if-else for creating a new database if it doesn't already exist ?

        String sql = "INSERT INTO test (testId, testInfo) VALUES (?, ?)";

        int result = jdbcTemplate.update(sql, "4", "test4");

        if (result > 0) {
            System.out.println(result + "\nA new row has been inserted");
        }
    }
}
