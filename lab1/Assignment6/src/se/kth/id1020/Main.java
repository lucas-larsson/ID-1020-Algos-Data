package se.kth.id1020;

/**
 * Author:      LUCAS LARSSON,LUCAS LARSSON.
 * Date:        2021-09-10
 * Description: main class that runs a method that preforms operations on a double linked list queue
 **/

import java.util.Scanner;
public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("hello");

        SortedLinkedList list = new SortedLinkedList();

        boolean quit = false;
        while (!quit){
            System.out.println("to add press 1");
            System.out.println("to delete press 2  ");
            System.out.println("to quite press 3 ");
            int a = sc.nextInt();
            switch (a) {

                case 1:
                    System.out.println(" insert the item you want to enqueue ");
                    int item = sc.nextInt();
                    list.insert(item);
                    list.displayList();
                    break;
                case 2:
                    System.out.println("dequeue");
                    list.remove();
                    list.displayList();
                    break;

                case 3:
                    System.out.println("Quit");
                    list.displayList();
                    quit = true;
            }
        }
    }
}


