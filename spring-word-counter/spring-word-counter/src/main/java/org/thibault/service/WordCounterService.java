package org.thibault.service;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Collections;

@Component
public class WordCounterService {
  
  private HashMap<String, Integer> words;
  
  public WordCounterService(){
    this.words = new HashMap<>();
  }
  
  public void countWords(String input){
    String[] inputWords = splitInput(input);
    addKeyValues(inputWords);
    
    for (String entry : this.words.keySet()){
      System.out.println(entry + ": " + this.words.get(entry));
    }
  }
  
  private String[] splitInput(String input){
    //replace all non-letter or space characters by ""
    input = input.replaceAll("[^a-zA-Z\\s]", "").toLowerCase();
    return input.split(" ");
  }
  
  private void addKeyValues(String[] inputWords){
    for(String word : inputWords){
      if (this.words.get(word) == null){
        this.words.put(word, 1);
      }
      else{
        int count = this.words.get(word);
        this.words.put(word, count+1);
      }
    }
  }
}


//Implement word counting functionality:
//
//Create a Spring component (bean) responsible for counting words in a sentence.
//Use the 'Singleton' scope for the bean by default (spring bean factory will create one instance).
//Implement a method that takes a sentence as input and counts the occurrences of each word.
//Disregard the difference between uppercase and lowercase letters (treat "Hello" and "hello" as the same word).
//Disregard punctuation marks in the sentence.