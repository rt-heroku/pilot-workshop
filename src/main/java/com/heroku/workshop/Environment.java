package com.heroku.workshop;

public class Environment {
 String env;
 
 public String getEnvironment(){
  return System.getenv("ENVIRONMENT");
 }

}
