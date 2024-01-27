package org.thibault.command;

import org.springframework.stereotype.Component;

@Component
public class Hello implements Command {
  
  @Override
  public String execute(){
    return "Hello, commander.";
  }
}
