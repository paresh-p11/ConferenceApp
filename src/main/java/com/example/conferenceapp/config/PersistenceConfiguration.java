package com.example.conferenceapp.config;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class PersistenceConfiguration {

  @Bean
  public DataSource dataSource(){
    DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
    dataSourceBuilder.url("jdbc:postgresql://localhost:5432/conference_app");
    System.out.println("*-*-*-*-*-*-* custom dataSource *-*-*-*-*-*");
    return  dataSourceBuilder.build();
  }

}
