package org.thibault.command;

import org.springframework.stereotype.Component;
import org.thibault.controller.RegistrationController;
import org.thibault.model.AllDoctors;
import org.thibault.service.RegistrationService;

@Component
public class RegisterCommand {
  
  private RegistrationController regController;
  
  public RegisterCommand(RegistrationService registrationService) {
    this.regController = new RegistrationController(registrationService);
  }
  
  public void execute(AllDoctors doctors){
    regController.registerVisit(doctors);
  }
  
}
