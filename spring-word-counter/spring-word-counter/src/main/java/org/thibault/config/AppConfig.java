package org.thibault.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.thibault.service.WordCounterService;

@Configuration
public class AppConfig {

  @Bean
  public WordCounterService getWcService(){
    return new WordCounterService();
  }
}
