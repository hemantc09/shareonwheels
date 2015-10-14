package com.itu.shareonwheels.launcher;

/**
 * Created by ramya on 10/2/15.
 */
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.sql.SQLException;

@SpringBootApplication
public class ShareOnWheelsServer {


    @Bean
    public DriverManagerDataSource dataSource()
    {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/shareonwheels");
        dataSource.setUsername("root");
        dataSource.setPassword("password");
        try {
            dataSource.getConnection().setAutoCommit(true);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dataSource;
    }

    public static void main(String[] args) {
        SpringApplication.run(ShareOnWheelsServer.class, args);
    }
}
