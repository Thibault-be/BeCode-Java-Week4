package org.thibault.logic;

import java.util.Scanner;

public class UserInterface {
  
  public void start(){
    
    Scanner scan = new Scanner(System.in);
    
    while (true){
      System.out.println("Available commands: register & report. Leave blank to exit");
      System.out.print("> ");
      
      String input = scan.nextLine();
      if (input.isEmpty()) break;
      
      if (input.equals("register")){
        System.out.println("register");
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
