package se.kth.id1020;

/**
 * Author:      LUCAS LARSSON,LUCAS LARSSON.
 * Date:        2021-09-10
 * Description: main class that runs a method that preforms operations on a double linked circular list queue
 **/

import java.util.Scanner;
public class Main {


    public static void main  (String[] args) throws EmptyQueueException {

        Scanner sc = new Scanner(System.in);
        DoubleLinkedListNode Dll = new DoubleLinkedListNode();


        boolean quit = false;
        while (!quit){
            System.out.println("to add press 1");
            System.out.println("to delete press 2  ");
            System.out.println("to quite press 3 ");
            int a = sc.nextInt();


            switch (a) {

                case 1:
                    System.out.println(" insert item you want to enqueue ");
                    String item = sc.next();
                    Dll.enQueueHead(item);
                    Dll.print();
                    break;
                case 2:
                    System.out.println("dequeue");
                    Dll.deQueueHead();
                    Dll.print();
                    break;
                case 3:
                    System.out.println("Quit");
                    Dll.print();
                    quit = true;
            }
        }
    }
}
