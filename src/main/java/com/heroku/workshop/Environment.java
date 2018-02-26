package com.heroku.workshop;
/*
NEW LINES

*/
import org.springframework.context.annotation.Bean;

public class Environment {
 String env;
 
 //@Bean
 public String getEnvironment(){
  System.out.println("ENVIRONMENT: " + System.getenv("ENVIRONMENT"));
  return System.getenv("ENVIRONMENT");
 }

}
