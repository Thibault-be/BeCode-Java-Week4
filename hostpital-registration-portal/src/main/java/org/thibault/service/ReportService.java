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
      System.out.println("\nNothing to display\n");
    }
    else {
      System.out.println("\nVisit report:");
      for (Visit visit : visits){
        System.out.println(visit.toString());
      }
      System.out.println();
    }
  }
}
