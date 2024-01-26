package org.thibault;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class HelloWorldService {
  
  @Value("${configured_language}")
  private String configuredLanguage;
  
  @Value("${EN_hello_world}")
  private String enMsg;
  
  @Value("${NL_hello_world}")
  private String nlMsg;
  
  @Value("${GER_hello_world}")
  private String gerMsg;
  
  @Value("${FR_hello_world}")
  private String frMsg;
  
  
  public String helloMessage(){
    switch(this.configuredLanguage){
      case "EN":
        return this.enMsg;
      case "NL":
        return this.nlMsg;
      case "GER":
        return this.gerMsg;
      case "FR":
        return this.frMsg;
      default:
        return "Hello World - Hallo Wereld - Bonjour le monde - Hallo welt";
    }
  }
}
