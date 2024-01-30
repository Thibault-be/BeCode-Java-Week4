package org.thibault;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.thibault.command.RegisterCommand;
import org.thibault.config.AppConfig;
import org.thibault.model.AllDoctors;
import org.thibault.model.Doctor;


import java.util.Scanner;

public class Main {
  
  public static void main(String[] args) {
    
    //Make some doctors
    Doctor john = new Doctor("John", "Doe", "Oncology");
    Doctor jane = new Doctor("Jane", "Doe", "Radiology");
    
    AllDoctors doctors = new AllDoctors();
    doctors.addDoctor(john);
    doctors.addDoctor(jane);
    
    
    ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    
    Scanner scan = new Scanner(System.in);
    
    while (true){
      System.out.println("Available commands: register & report. Leave blank to exit");
      System.out.print("> ");
      
      String input = scan.nextLine();
      if (input.isEmpty()) break;
      
      if (input.equals("register")){
        RegisterCommand register = context.getBean(RegisterCommand.class);
      }
      else if (input.equals("report")){
        System.out.println("report");
      }
      else {
        System.out.println("Command not recognised. Please try again");
      }
      
      
    }
    
  }
    
}

