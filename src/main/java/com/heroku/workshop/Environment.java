package com.heroku.workshop;

public class Environment {
 String env;
 
 public String getEnvironment(){
  System.out.println(System.getenv("ENVIRONMENT"));
  return System.getenv("ENVIRONMENT");
 }

}
