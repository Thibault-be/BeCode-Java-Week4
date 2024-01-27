package org.thibault.command;

import org.springframework.stereotype.Component;

@Component
public interface Command {
  
  String execute();
  
}
