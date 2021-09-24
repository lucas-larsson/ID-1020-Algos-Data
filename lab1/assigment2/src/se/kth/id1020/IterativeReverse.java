package se.kth.id1020;

/**
 * Author:      LUCAS LARSSON
 * Date:        2021-09-10
 * Description: class containing one revers algorithm using loops.
 **/

public class IterativeReverse {

    // a method that read from StdIN and print in reverse to StdOut
    static void itrReverse() {
        Stack <Character>stack = new <Character> Stack(); //  specify the data type of the stack
        char c = 0;
        while ( c != 0xa ) {
            c = Main.sc.next().charAt(0);        // scanner
            stack.push(c);                       // input
        }
        while ( !stack.isEmpty()) {            // or stack.getSize() > 0
            System.out.print(stack.pop());       // output
        }
    }
}