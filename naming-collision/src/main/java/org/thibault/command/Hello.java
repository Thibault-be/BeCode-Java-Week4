package org.thibault.command;

import org.springframework.stereotype.Component;

@Component
public class Hello implements Command {
  
  @Override
  public void execute(){
    System.out.println("Hello, commander.");
  }
}
