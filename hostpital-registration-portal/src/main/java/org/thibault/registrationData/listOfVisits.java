package org.thibault.registrationData;

import java.util.ArrayList;
import java.util.List;

public class listOfVisits {
  
  private List<Visit> visits;
  
  public listOfVisits() {
    this.visits = new ArrayList<>();
  }
  
  public void addVisist(Visit visit){
    this.visits.add(visit);
  }
}
