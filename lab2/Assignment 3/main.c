#include <stdio.h>
#include "sort.h"
/**
 * Author:      LUCAS LARSSON
 * Date:        2021-09-20
 * Description: main class that handles the io to and from the sorting algorithm
 **/
int main() {
    printf("Insert the size of the desired array \n");
    int n;
    scanf("%d", &n);                 // take the input that is used to declare the size of the array
    int toBeSorted[n];               // declare the array

    printf("insert the elements of the array \n");
    for (int i = 0; i < n; i++)      // a loop to take the input of the array
        scanf("%d", &toBeSorted[i]);

    sort(toBeSorted, n);            // calling the sorting method

    for (int i = 0; i < n; i++)     // a method to print the elements of the array
    {
        printf("[");
        printf("%d", toBeSorted[i]);
        printf("]");
    }
    return 0;
}