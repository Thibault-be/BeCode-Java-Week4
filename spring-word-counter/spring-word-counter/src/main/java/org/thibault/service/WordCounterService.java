package org.thibault.service;

import org.springframework.stereotype.Component;

import java.util.*;
import java.util.stream.Collectors;

@Component
public class WordCounterService {
  
  private List<HashMap<String, Integer>> words;
  
  public WordCounterService(){
    this.words = new ArrayList<>();
  }
  
  public void countWords(String input){
    List<String[]> inputWords = splitInput(input);
    addKeyValues(inputWords);
    printResultsTable(this.words);
  }
  
  private List<String[]> splitInput(String input){
    List<String> sentences = Arrays.stream(input.split("\\."))
        .map(String::trim)
        .collect(Collectors.toList());
        
    List<String[]> brokenSentences = new ArrayList<>();
    
    for(String sentence : sentences){
      //replace all non-letter or space characters by ""
      sentence = sentence.replaceAll("[^a-zA-Z\\s]", "").toLowerCase();
      System.out.println("sentence: " + sentence);
      brokenSentences.add(sentence.split(" "));
    }
    return brokenSentences;
  }
  
  private void addKeyValues(List<String[]> inputWords){
    for(String[] sentence : inputWords){
      HashMap<String, Integer> sentenceMap = new HashMap<>();
      for(String word : sentence){
        if(sentenceMap.get(word) == null){
          sentenceMap.put(word, 1);
        }
        else{
          int count = sentenceMap.get(word);
          sentenceMap.put(word, count+1);
        }
      }
      this.words.add(sentenceMap);
    }
  }
  
  private void printResultsTable(List<HashMap<String, Integer>> results){
    System.out.println("--------------------------");
    System.out.printf("| %-13s |  %-5s |%n", "WORD", "COUNT" );
    System.out.println("--------------------------");
    
    int count = 1;
    for (HashMap<String, Integer> sentence : results){
      System.out.println("   WORD COUNT SENTENCE " + count);
      System.out.println("--------------------------");
      for (String key : sentence.keySet()){
        System.out.printf("| %-13s |    %-3d |%n", key, sentence.get(key));
      }
      System.out.println("--------------------------");
      count++;
    }
  }
}
