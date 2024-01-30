package org.thibault.model;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class AllDoctors {
  
  private List<Doctor> doctors;
  
  public AllDoctors() {
    this.doctors = new ArrayList<>();
  }
  
  public void addDoctor(Doctor doctor){
    this.doctors.add(doctor);
    doctor.setId(this.doctors.size());
  }
  
  public Doctor getDoctorById(int id){
    for (Doctor doctor : this.doctors){
      if (doctor.getId() == id) return doctor;
    }
    return null;
  }
  
  public String toString(){
    
    StringBuilder bob = new StringBuilder();
    
    int count = 1;
    for (Doctor doctor : this.doctors){
      String newLine = count + ": Dr." + doctor.getFirstName() + " " + doctor.getLastName() + " - " + doctor.getDepartment() +"\n";
      bob.append(newLine);
      count++;
    }
    String lastLine = count + ": I am visiting a patient.\n";
    bob.append(lastLine);
    
    return bob.toString();
  }
  
}
