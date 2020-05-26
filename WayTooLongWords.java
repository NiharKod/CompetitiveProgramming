//package com.company;

import java.io.IOException;
import java.util.Scanner;

public class WayTooLongWords {
    public static void main (String [] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){

            String longWord;
            longWord = sc.next();
            if(longWord.length() > 10) {
                int wordLen;

                wordLen = longWord.length();
                char firstChar = longWord.charAt(0);
                char secondChar = longWord.charAt(wordLen - 1);


                String output = firstChar + Integer.toString(wordLen - 2) + secondChar;
                System.out.println(output);
            }
            else {
                System.out.println(longWord);
            }

        }
    }
}
