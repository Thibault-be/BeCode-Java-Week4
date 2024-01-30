package org.thibault.registrationData;

public class Visitor {
  
  private final String firstName;
  private final String lastName;
  
  public Visitor(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }
  
  public String getFirstName() {
    return firstName;
  }
  
  public String getLastName() {
    return lastName;
  }
}
