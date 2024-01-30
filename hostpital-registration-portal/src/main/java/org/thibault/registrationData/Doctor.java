package org.thibault.registrationData;

public class Doctor {
  
  private final String firstName;
  private final String lastName;
  private final String department;
  
  public Doctor(String firstName, String lastName, String department) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.department = department;
  }
  
  public String getFirstName() {
    return firstName;
  }
  
  public String getLastName() {
    return lastName;
  }
  
  public String getDepartment() {
    return department;
  }
}
