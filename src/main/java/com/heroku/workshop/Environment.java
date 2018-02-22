package com.heroku.workshop;

import org.springframework.context.annotation.Bean;

public class Environment {
 String env;
 
 @Bean
 public String getEnvironment(){
  System.out.println(System.getenv("ENVIRONMENT"));
  return System.getenv("ENVIRONMENT");
 }

}
