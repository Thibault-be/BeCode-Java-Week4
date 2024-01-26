package org.thibault;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HelloSpring
{
    public static void main( String[] args ){
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorldService hello = context.getBean(HelloWorldService.class);
        
        System.out.println(hello.helloMessage());
        
    }
}
