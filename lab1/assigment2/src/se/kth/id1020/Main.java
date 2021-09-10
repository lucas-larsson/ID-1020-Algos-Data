package se.kth.id1020;

import java.util.Scanner;

/**
 * Author:      LUCAS LARSSON
 * Date:        2021-09-09
 * Description: Main class that runs the other 2 reverse methods
 **/
public class Main {

    // Static scanner to give input to both reversing Algorithms
    static  Scanner sc = new Scanner(System.in).useDelimiter("");
    // main method preforms only calls to other methods
    public static void main(String [] args) {

        System.out.println("enter what you want to reverse: ");
        System.out.print("recursively: ");
        RecursiveReverse.recReverse();
        System.out.println(" ");

        System.out.print("iteratively: ");
        IterativeReverse.itrReverse();
        System.out.println(" ");


    }
}
