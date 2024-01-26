package org.thibault;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class HelloSpringTest {
  
  @Test
  public void FRReturnsBonjourLeMondeAvecSpring() {
    ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    HelloWorldService hello = context.getBean(HelloWorldService.class);
    
    assertEquals("Bonjour le monde avec spring!", hello.helloMessage());
  }
  
  
}
