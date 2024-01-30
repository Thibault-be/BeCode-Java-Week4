package org.thibault.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.thibault.logic.UserInterface;

@Configuration
public class AppConfig {
  
  @Bean
  public UserInterface getUI(){
    return new UserInterface();
  }
}
