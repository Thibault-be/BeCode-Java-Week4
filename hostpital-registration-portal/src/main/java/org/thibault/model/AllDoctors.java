package org.thibault.model;

import java.util.ArrayList;
import java.util.List;

public class AllDoctors {
  
  private List<Doctor> doctors;
  
  public AllDoctors() {
    this.doctors = new ArrayList<>();
  }
  
  public void addDoctor(Doctor doctor){
    this.doctors.add(doctor);
  }
}
