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

        String sql = "INSERT INTO test (testId, testInfo) VALUES (?, ?)";

        // if the table 'test' already exists, insert a new row
        try {
            insertRow(sql);

        } catch(Exception e) { // otherwise, create the table then add a new row

            System.err.println("Table does not exist yet");
            System.out.println("Creating table 'test'");

            String createTable = "CREATE TABLE test.test (testId INT NOT NULL, testInfo VARCHAR(45) NOT NULL, PRIMARY KEY (testId))";
            jdbcTemplate.execute(createTable);

            insertRow(sql);
        }
    }

    public void insertRow(String sql) {
        int result = jdbcTemplate.update(sql, "5", "test5");

        if (result > 0) {
            System.out.println(result + "\nA new row has been inserted");
        }
    }
}
