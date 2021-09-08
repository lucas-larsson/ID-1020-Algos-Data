/*
 * Authored by LUCAS LARSSON
 * 08 sep 2021
 */
#include<stdio.h>
// C program to reverse a string using recursion

    void rec_reverse() {
        int c = getchar(); // why char and not int?
        if ( c != 0xa ){   // 0xa is hex for "\n" , call itself until the end of the line
            rec_reverse(); //rec_reverse()..rec_reverse()^n.
            putchar(c);
        }
    }

/* main method in case of running a single file
    int main() {
    printf("enter what you want to reverse: \n");
    rec_reverse();
    printf("\n");
    return 0;
}
*/

/*
 * an alternative method sing pointers
 * note that this method needs hardcoded input or a scanner
 *
 * void rec_reverse(string str)
 * {
 * if (*str)
 *      {
 *      rec_reverse (str+1);
 *      printf("%c", *str);
 *      }
 * }
 */