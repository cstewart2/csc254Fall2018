package com.noynaert.csc254;


import java.util.Arrays;
import java.util.Comparator;

public class App {

    public static void main(String[] args) {

        String sentence = "This class contains various methods for manipulating arrays (such as sorting and searching). This class also contains a static factory that allows arrays to be viewed as lists.\n";
        String[] words = sentence.split("\\W+");
        System.out.printf("the array is pretty decently sized at %d entries.\n", words.length);

        //print(words, "Original List");

        //Try to make the words lower case
        for (String word : words) {
            word = word.toLowerCase();
            System.out.println(word);
        }
        print(words, "After attempting to change to lower case with for each");
        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].toLowerCase();
        }
        print(words, "Changing to toLowerCase with a conventional for(int i ... loop");

        //Arrays.sort(words);
        //print(words, "After sorting");

        Arrays.sort(words, new CompareByLength());
        print(words,"Sorting by length");
    }

    public static void print(String[] words, String message) {
        System.out.printf("\n-------- %s ------------\n", message);
        for (String word : words) {
            System.out.println(word);
        }
    }

}

class CompareByLength implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        int result = o1.length() - o2.length();
        if(result == 0)
            result = o1.compareTo(o2);
        return result;
    }
}

