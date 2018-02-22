package com.heroku.workshop;

public class Environment {
 String env;
 
 public String getEnvironment(){
  System.out.println("Environment: " + System.getEnv("ENVIRONMENT"));
  return System.getEnv("ENVIRONMENT");
 }

}
