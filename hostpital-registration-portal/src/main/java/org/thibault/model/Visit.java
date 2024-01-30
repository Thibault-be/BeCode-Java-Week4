package org.thibault.model;

import org.thibault.model.Doctor;
import org.thibault.model.Visitor;

import java.sql.Timestamp;

public class Visit {
  
  private Doctor doctor;
  private final Visitor visitor;
  private final Timestamp timestamp;

  public Visit( Visitor visitor, Timestamp timestamp) {
    this.doctor = null;
    this.visitor = visitor;
    this.timestamp = timestamp;
  }
  
  public void setDoctor(Doctor doctor){
    this.doctor = doctor;
  }
  
  public Doctor getDoctor() {
    return doctor;
  }
  
  public Visitor getVisitor() {
    return visitor;
  }
  
  public Timestamp getTimestamp() {
    return timestamp;
  }
  
  public String toString(){
    String visitor = this.visitor.getFirstName() + " " + this.visitor.getLastName();
    
    String doctor = "Visiting a patient";
    if (this.doctor != null) {
      doctor = "Dr. " + this.doctor.getFirstName() + " " + this.doctor.getLastName();
    }
    return visitor + " - " + doctor + " - " + this.timestamp;
  }
}
