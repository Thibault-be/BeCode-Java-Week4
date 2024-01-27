package org.thibault.command;

import org.springframework.stereotype.Component;

import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

@Component
public class Time implements Command{
  
  public String execute(){
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss - dd/MM/yyyy");
    LocalDateTime dateTime = LocalDateTime.now();
    return formatter.format(dateTime);
  }
}
