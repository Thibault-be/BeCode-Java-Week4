package org.thibault;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:application.properties")
public class AppConfig {

  @Bean ("HelloWorldService")
  public HelloWorldService HelloWorldService(){
    return new HelloWorldService();
  }

}
