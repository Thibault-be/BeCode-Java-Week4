package org.thibault.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.thibault.model.Visit;

@Service
public class RegistrationService {
  
  List<Visit> visits;
  
  public RegistrationService() {
    this.visits = new ArrayList<>();
  }
  
  public void registerVisit(Visit visit){
    this.visits.add(visit);
  }
  
  public List<Visit> getAllVisits(){
    return this.visits;
  }
}
