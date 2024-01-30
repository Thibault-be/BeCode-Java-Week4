package org.thibault.command;

import org.springframework.stereotype.Component;
import org.thibault.controller.RegistrationController;
import org.thibault.model.AllDoctors;
import org.thibault.service.ReportService;

@Component
public class ReportCommand {
  
  private final ReportService reportService;
  
  public ReportCommand(ReportService reportService){
    this.reportService = reportService;
  }
  
  public void execute(){
    this.reportService.generateReport();
  }

}
