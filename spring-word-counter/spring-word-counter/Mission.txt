# Word Counter

* Type of challenge: **Learning**
* Duration: **Unknown**
* Team challenge: **Solo**

## Learning objectives
- Gain familiarity with Maven and the plain Spring library.
- Understand how to handle command line input in a Spring application.
- Practice creating Spring beans with different scopes.
- Implement a word counting feature and handle text processing.

## Requirements
- Java development environment set up with Maven.
- Basic understanding of Spring framework concepts.

## The Mission

Your mission is to create a small Java program using Maven and the plain Spring library that counts the occurrences of each word in a sentence entered by the user via the command line. Follow these steps to complete the challenge:

1. Set up a Maven project:
   - Create a new Maven project in your preferred Java development environment.
   - Add the necessary dependencies for using the plain Spring library.

2. Implement word counting functionality:
   - Create a Spring component (bean) responsible for counting words in a sentence.
   - Use the 'Singleton' scope for the bean by default (spring bean factory will create one instance).
   - Implement a method that takes a sentence as input and counts the occurrences of each word.
   - Disregard the difference between uppercase and lowercase letters (treat "Hello" and "hello" as the same word).
   - Disregard punctuation marks in the sentence.

3. Handle command line input:
   - In your main Java class, create a method to read a single line of input from the command line.
   - Use the Spring context to instantiate the word counting bean.
   - Prompt the user to enter a sentence and read the input using the method you created.
   - Call the word counting method with the input sentence.
   - Print the words and their occurrences in a tabular format as shown in the example.

Example:

User input: "Hello world, hello there"

| Word  | Occurrences |
|-------|-------------|
| hello | 2           |
| world | 1           |
| there | 1           |

4. Handle multiple sentences (Extra):
   - If the user enters more than one sentence separated by periods or other punctuation marks, the program should handle them separately.
   - Modify your word counting method to accept a list of sentences instead of a single sentence.
   - Ensure each sentence is counted independently, and the occurrences are displayed for each sentence.

5. Implement alternative Spring bean scope (Extra):
   - Create another version of the word counting bean with the 'prototype' scope.
   - Modify your main Java class to use the prototype bean instead of the default singleton bean.
   - Observe the difference in behavior when counting words with the prototype bean.

Remember to maintain clean and organized project structure, and write test cases to verify the correctness of your word counting functionality.