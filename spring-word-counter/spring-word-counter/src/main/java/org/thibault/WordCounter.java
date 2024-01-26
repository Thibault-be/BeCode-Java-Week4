package org.thibault;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import org.thibault.config.AppConfig;
import org.thibault.service.WordCounterService;

import java.util.Scanner;

public class WordCounter{
    
    public static void main( String[] args ){

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        WordCounterService wc = context.getBean(WordCounterService.class);
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Please put in the sentence you want the words counted of:");
        System.out.print("> ");
        
        String input = scan.nextLine();
        wc.countWords(input);
    }
}
