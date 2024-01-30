package org.thibault.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.thibault.command.RegisterCommand;
import org.thibault.command.ReportCommand;
import org.thibault.model.AllDoctors;
import org.thibault.service.RegistrationService;
import org.thibault.service.ReportService;


@Configuration
public class AppConfig {
  
  @Bean
  public RegisterCommand registerCmd(RegistrationService registrationService){
    return new RegisterCommand(registrationService);
  }
  
  @Bean
  public RegistrationService registrationService(){
    return new RegistrationService();
  }
  
  @Bean
  public AllDoctors doctors(){
    return new AllDoctors();
  }
  
  
  @Bean
  public ReportService reportService(RegistrationService registrationService){
    return new ReportService(registrationService);
  }
  
  @Bean
  public ReportCommand reportCommand(ReportService reportService){
    return new ReportCommand(reportService);
  }
  

}
