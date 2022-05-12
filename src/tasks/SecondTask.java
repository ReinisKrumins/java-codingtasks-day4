package tasks;

import java.util.Arrays;
import java.util.HashSet;
import java.util.StringTokenizer;

public class SecondTask
{
    public static void main(String[] args)
    {

        System.out.println("*First algorithm that counts total words*");
        WordsInAString w = new WordsInAString(Text.TEXT);
        w.stringLength();

        System.out.println("*Second algorithm that counts total words and unique words*");
        UniqueWordsInAString(Text.TEXT);

        System.out.println("*Third algorithm that counts unique words*");
        String[] words = Text.TEXT.split(" ");

        /*
            Code from ->
            https://www.tutorialkart.com/java/java-program-find-unique-words-in-a-string/
         */
        HashSet<String> uniqueWords = new HashSet<String>(Arrays.asList(words));
        int counter = 0;
        for(String s:uniqueWords)
            counter++;
        System.out.println("Unique words in text: " + counter);

    }
    public final class Text
    {
        public static final String TEXT =
                "Polymorphism is the ability of an object to take on many forms The most common use of polymorphism in " +
                "OOP occurs when a parent class reference is used to refer to a child class object \n" +
                "\n" +
                "Any Java object that can pass more than one IS-A test is considered to be polymorphic In Java all " +
                "Java objects are polymorphic since any object will pass the IS-A test for their own type and for the class Object \n" +
                "\n" +
                "It is important to know that the only possible way to access an object is through a reference variable " +
                "A reference variable can be of only one type Once declared the type of a reference variable cannot be changed \n" +
                "\n" +
                "The reference variable can be reassigned to other objects provided that it is not declared final The " +
                "type of the reference variable would determine the methods that it can invoke on the object \n" +
                "\n" +
                "A reference variable can refer to any object of its declared type or any subtype of its declared type " +
                "A reference variable can be declared as a class or interface type";
        }
        /*
            Took the word counting class from ->
            https://www.codespeedy.com/how-to-count-the-number-of-words-in-a-string-in-java/
         */
    public static class WordsInAString{
        String str;
        public WordsInAString(String str){
            this.str = str;
        }
        public void stringLength(){
            if(str.isEmpty() || str == null){
                System.out.println("There are no words in the sentence.\n");
            }
            else{
                StringTokenizer words = new StringTokenizer(str); // StringTokenizer class object is created
                int length = words.countTokens();  // countTokens() method counts the number of words
                System.out.println("There are " + length + " words in the Sentence."); // print the length
            }
        }
    }
    /*
        Took the word counting class from ->
        https://stackoverflow.com/questions/22981210/counting-unique-words-in-a-string-without-using-an-array
     */
    public static void UniqueWordsInAString(String inputString)
    {
        final char token = '#';
        String processedInput  = "";
        String currentWord     = "";
        int wordCount = 0;
        int uniqueWordCount = 0;

        for (char c : inputString.toCharArray())
        {
            // If c isn't an empty space then it will add to the string
            if (c != ' ')
            {
                processedInput += c;
                currentWord    += c;
            }
            else // Else it adds '#' symbol in blank space and then increments wordCount
            {
                processedInput += token;
                wordCount++;

                String existingWord = "";
                int occurences = 0;

                // Goes through an array and matches non '#'
                // with an existing word and increments existingWord count
                for (char c1 : processedInput.toCharArray())
                {
                    if (c1 != token)
                    {
                        existingWord += c1;
                    } else
                    {
                        // Counts how many times words are in the TEXT
                        if (existingWord.equals(currentWord))
                        {
                            occurences++;
                        }
                        existingWord = "";
                    }
                }

                // If the word occurred only once then it is a unique word
                if (occurences <= 1) {
                    //System.out.printf("New word: %s\n", currentWord);
                    uniqueWordCount++;
                }

                currentWord = "";
            }
        }
        wordCount++;

        System.out.printf("%d words total, %d unique\n", wordCount, uniqueWordCount);
    }

    }