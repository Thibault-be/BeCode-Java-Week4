package org.thibault.model;

import org.springframework.stereotype.Component;
import org.thibault.model.Visit;

import java.util.ArrayList;
import java.util.List;

@Component
public class listOfVisits {
  
  private List<Visit> visits;
  
  public listOfVisits() {
    this.visits = new ArrayList<>();
  }
  
  public void addVisit(Visit visit){
    this.visits.add(visit);
  }
}
