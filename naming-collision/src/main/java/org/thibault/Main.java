package org.thibault;

import org.thibault.command.Hello;
import org.thibault.command.Time;

public class Main {
  
  public static void main(String[] args) {
    
    Hello hello = new Hello();
    hello.execute();
    
    Time time = new Time();
    time.execute();
  }
}
