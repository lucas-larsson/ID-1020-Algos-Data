/*
 * Authored by LUCAS LARSSON
 * 08 sep 2021
 */


#include <stdio.h>
#include "recursive_reverse.h"
#include "iterative_reverse.h"

// main method that calls methods in other files
int main()
{
    printf("enter what you want to reverse: \n");
    printf("recursively:");
    rec_reverse();

    printf("\n");
    printf("iteratively:");
    itr_reverse();
    return 0;
}