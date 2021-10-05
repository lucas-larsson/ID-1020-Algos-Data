package KTH.ID1020;
import edu.princeton.cs.algs4.*;

import java.io.*;
import java.util.Scanner;
/**
 * Author:      LUCAS LARSSON
 * Date:        2021-10-03
 * Description: A main class that iterates through the tree and prints the first 200 words in either
 * Alphabetic order or Revers Alphabetic
 **/

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
       BST st = FrequencyCounter.wordCounter(200);
        Scanner sc = new Scanner(System.in);

        boolean quit = false;
        while (!quit){
            System.out.println("to print in Alphabetic order press 1");
            System.out.println("to print in reverse Alphabetic order press 2");
            System.out.println("to Quit press 3");
            int a = sc.nextInt();

            switch (a) {
                case 1 -> st.printInOrder();
                case 2 -> st.printInReverseOrder();
                case 3 -> {
                    System.out.println("Quit");
                    quit = true;
                }
            }
        }
    }
}