package org.thibault.command;

import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class Time implements Command{
  
  public void execute(){
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss - dd/MM/yyyy");
    LocalDateTime dateTime = LocalDateTime.now();
    System.out.println(formatter.format(dateTime));
  }
}
