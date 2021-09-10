package se.kth.id1020;

/**
 * Author:      LUCAS LARSSON
 * Date:        2021-09-10
 * Description: class containing one revers algorithm using loops.
 **/

public class IterativeReverse {

    // a method that read from StdIN and print in reverse to StdOut
    static void itrReverse() {
        Stack stack = new Stack(); // <Character> what is the difference? // create a new instance of a constructor
        char c = 0;
        while ( c != 0xa ) {
            c = Main.sc.next().charAt(0);        // scanner
            stack.push(c);                       // input
        }
        while ( stack.getSize() > 0) {            // or (!stack.isEmpty)
            System.out.print(stack.pop());       // output
        }
    }
}
