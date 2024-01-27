package org.thibault;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.thibault.command.Hello;
import org.thibault.command.Time;
import org.thibault.config.AppConfig;

import java.util.Scanner;

public class Main {
  
  public static void main(String[] args) {
    
    Scanner scan = new Scanner (System.in);
    ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    
    Hello hello = context.getBean(Hello.class);
    Time time = context.getBean(Time.class);
    
    while (true){
      System.out.println("Please enter one of the commands. hello or time.");
      System.out.println("Press enter (no input) to quit.");
      System.out.print("> ");
      String input = scan.nextLine().toLowerCase().trim();
      
      switch (input){
        case "hello":
          System.out.println(hello.execute());
          break;
        case "time":
          System.out.println(time.execute());
          break;
        case "":
          return;
        default:
          System.out.println(input + " is not a valid command. Please try again");
      }
    }
  }
}
