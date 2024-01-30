package org.thibault;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.thibault.config.AppConfig;
import org.thibault.logic.UserInterface;

public class Main {
  
  public static void main(String[] args) {
    
    ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    
    UserInterface ui = context.getBean(UserInterface.class);
    
    ui.start();
    
  }
}
