package se.kth.id1020;
/**
 * Author:      LUCAS LARSSON
 * Date:        2021-09-09
 * Description: class containing one revers algorithm using recursion
 **/

public class RecursiveReverse {
    // a method that read from StdIN and print in reverse to StdOut
    static void recReverse() {
        char c = Main.sc.next().charAt(0);  // scanner and .charAt(0) reads the first character
        if (c != 0xa) {                     // 0xa is hex for "\n" .
            recReverse();                   // as long as (c != 0xa) is true
        }
        System.out.print(c);
    }
}
