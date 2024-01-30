package org.thibault.controller;

import org.thibault.model.AllDoctors;
import org.thibault.model.Visit;
import org.thibault.model.Visitor;
import org.thibault.service.RegistrationService;

import java.sql.Timestamp;
import java.util.Date;
import java.util.Scanner;

public class RegistrationController {
  
  private RegistrationService registrationService;
  
  public RegistrationController(RegistrationService registrationService) {
    this.registrationService = registrationService;
  }
  
  public void registerVisit(AllDoctors doctors){
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Welcome to the registration portal. Please enter in your details.");
    System.out.print("First name: ");
    String firstName = scanner.nextLine();
    System.out.print("Last name: ");
    String lastname = scanner.nextLine();
    
    Visitor visitor = new Visitor(firstName, lastname);
    
    //create new visit
    int possibleDoctors = doctors.getSize() + 1;
    boolean flag = true;
    int doctorId = 0;
    while(flag){
      System.out.println("\nWhich doctor do you have an appointment with?");
      System.out.println(doctors.toString());
      doctorId = scanner.nextInt();
      if (doctorId > possibleDoctors){
        System.out.println("That entry wasn't possible, please try again.\n");
        continue;
      }
      flag = false;
    }
    
    Date date = new Date();
    Timestamp timestamp = new Timestamp(date.getTime());
    Visit newVisit = new Visit(visitor, timestamp);
    
    try {
      newVisit.setDoctor(doctors.getDoctorById(doctorId));
    }
    catch (Exception e){
      //do nothing
    }
    this.registrationService.registerVisit(newVisit);
    
    System.out.println("New registration successfully logged.: " + newVisit + "\n");
  }
}
