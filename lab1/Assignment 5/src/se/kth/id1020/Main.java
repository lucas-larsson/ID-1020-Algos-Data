package se.kth.id1020;

import java.util.Scanner;
public class Main {

    public static void main  (String[] args) throws EmptyQueueException {
        Scanner sc = new Scanner(System.in);
        DoubleLinkedListNode Dll = new DoubleLinkedListNode();


        boolean quit = false;
        while (!quit){
            System.out.println("to add press 1");
            System.out.println("to delete press 2");
            System.out.println("to quite press 3");
            System.out.println("to remove kth press 4");
            int a = sc.nextInt();


            switch (a) {

                case 1:
                    System.out.println(" insert the item you want to enqueue ");
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
                case 4:
                    System.out.println("remove kth");
                    Dll.print();
                    Dll.removekth();

                    }
                }
            }
        }
