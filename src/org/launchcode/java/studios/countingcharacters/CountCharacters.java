package org.launchcode.java.studios.countingcharacters;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;

import java.util.Map;
import java.util.Scanner;

public class CountCharacters {
    public static void main(String[] args) throws FileNotFoundException {
        //String hiddenFiguresString = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        File file = new File("src/org/launchcode/java/studios/countingcharacters/string.txt");
        Scanner input = new Scanner(file);
        System.out.println("Please enter a string");
        String hiddenFiguresString = input.nextLine().toLowerCase().replaceAll("[^a-z]", "");
        HashMap<Character, Integer> letters = new HashMap<>();


        for (char letter: hiddenFiguresString.toCharArray()) {
            if (letters.containsKey(letter)){
                letters.put(letter, letters.get(letter)+1);
            }
            else {
                letters.put(letter, 1);
            }

            }
        for (Map.Entry<Character, Integer> letter: letters.entrySet()) {
            System.out.println(letter.getKey()+":" + letter.getValue());
        }
        input.close();
    }

}


