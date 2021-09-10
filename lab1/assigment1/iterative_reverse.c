/*
 * Authored by LUCAS LARSSON
 * 08 sep 2021
 */

#include <stdio.h>

// C program to reverse a string iteratively with 2 loops.
void itr_reverse()
{
    int i = 1;                      // what happens if you start at 0?
    char str[100];
    str[0] = getchar();             // takes in the fist char

    while ( str[ i - 1] != 0xa )    // 0xa is assci code for new line "\n"
    {
        str[i] = getchar();         // stores the chars in an index list
        i++;
    }

    int j = i-2;                    // the index for the last char in the list
    while ( j >= 0)
    {
        putchar(str[j]);            // prints out the chars from the list in reverser order
        j--;
    }
}



 /*
  *
  * int main() {
    printf("enter what you want to reverse: \n");
    printf("iteratively:");
    itr_reverse();
    printf("\n");
    return 0;
}

  */
