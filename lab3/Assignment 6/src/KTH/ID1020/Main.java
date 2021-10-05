package KTH.ID1020;
import edu.princeton.cs.algs4.*;

import java.io.*;
import java.util.Scanner;
/**
 * Author:      LUCAS LARSSON
 * Date:        2021-10-03
 * Description: a main class that uses the table returned by the word counter
 * to check how many times
 * a word occurs in the text.
 **/

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner inputScanner = new Scanner(System.in);
        SeparateChainingHashST ht = WordCounter.wordCounter();

        boolean quit = false;
        while (!quit){
            System.out.println("to search press 1");
            System.out.println("to quit press 2");
            int a = inputScanner.nextInt();
            switch (a) {
                case 1 -> {
                    System.out.println(" what are you looking for? ");
                    String key = inputScanner.next();
                    System.out.println("Repeated ["+ht.get(key)+"] times ");
                }
                case 2 -> {
                    System.out.println("Quit");
                    quit = true;
                }
            }
        }
    }
}
