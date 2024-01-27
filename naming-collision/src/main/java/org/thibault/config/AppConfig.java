package org.thibault.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.thibault.command.Command;
import org.thibault.command.Hello;
import org.thibault.command.Time;

@Configuration
public class AppConfig {
  
  @Bean
  public Hello getHello(){
    return new Hello();
  }
  
  @Bean
  public Time getTime(){
    return new Time();
  }
}
