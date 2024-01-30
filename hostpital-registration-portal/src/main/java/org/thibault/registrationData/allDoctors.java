package org.thibault.registrationData;

import java.util.ArrayList;
import java.util.List;

public class allDoctors {
  
  private List<Doctor> doctors;
  
  public allDoctors() {
    this.doctors = new ArrayList<>();
  }
  
  public void addDoctor(Doctor doctor){
    this.doctors.add(doctor);
  }
}
