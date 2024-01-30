package org.thibault.registrationData;

import java.sql.Timestamp;

public class Visit {
  
  private final Doctor doctor;
  private final Visitor visitor;
  private final Timestamp timestamp;

  public Visit(Doctor doctor, Visitor visitor, Timestamp timestamp) {
    this.doctor = doctor;
    this.visitor = visitor;
    this.timestamp = timestamp;
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
  
  
  
}
