package org.thibault;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.thibault.command.RegisterCommand;
import org.thibault.command.ReportCommand;
import org.thibault.config.AppConfig;
import org.thibault.model.AllDoctors;
import org.thibault.model.Doctor;


import java.util.Scanner;

public class Main {
  
  public static void main(String[] args) {
    
    ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    RegisterCommand register = context.getBean(RegisterCommand.class);
    ReportCommand report = context.getBean(ReportCommand.class);
    
    //Make some doctors
    Doctor john = new Doctor("John", "Doe", "Oncology");
    Doctor jane = new Doctor("Jane", "Doe", "Radiology");
    AllDoctors doctors = context.getBean(AllDoctors.class);
    doctors.addDoctor(john);
    doctors.addDoctor(jane);
    
    Scanner scan = new Scanner(System.in);
    
    while (true){
      System.out.println("Available commands: register & report. Leave blank to exit");
      System.out.print("> ");
      
      String input = scan.nextLine();
      if (input.isEmpty()) break;
      
      if (input.equals("register")){
        register.execute(doctors);
      }
      else if (input.equals("report")){
        report.execute();
      }
      else {
        System.out.println("Command not recognised. Please try again");
      }
    }
  }
}

