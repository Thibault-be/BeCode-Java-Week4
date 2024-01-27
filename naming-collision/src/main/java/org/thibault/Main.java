package org.thibault;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.thibault.command.Hello;
import org.thibault.command.Time;
import org.thibault.config.AppConfig;

public class Main {
  
  public static void main(String[] args) {
    
    ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    
    Hello hello = context.getBean(Hello.class);
    Time time = context.getBean(Time.class);
    
    hello.execute();
    time.execute();
    
  }
}
