package org.thibault.service;

import org.springframework.stereotype.Service;
import org.thibault.model.Visit;

import java.util.ArrayList;
import java.util.List;

@Service
public class ReportService {

  private RegistrationService registrationService;
  
  public ReportService (RegistrationService registrationService){
    this.registrationService = registrationService;
  }
  
  public void generateReport(){
    List<Visit> visits = this.registrationService.getAllVisits();
    
    if (visits.isEmpty()){
      System.out.println("nothing to display");
    }
    else {
      System.out.println("Visit report:");
      for (Visit visit : visits){
        System.out.println(visit.toString());
      }
    }
    
    for (Visit visit : visits){
      System.out.println(visit.toString());
    }
  }
}
