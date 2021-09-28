/*
 * Authored by LUCAS LARSSON
 * 08 sep 2021
 * header file, see original C file for more detail
 */
#include <stdio.h>
#include <string.h>

void itr_reverse() {
    int i = 1;
    char str[100];
    str[0] = getchar();
    while ( str[i-1 ] != 0xa ) {
        str[i] = getchar();
        i++;
    }
    int j = i-2;
    while ( j >= 0) {
        putchar(str[j]);
        j--;
    }
}
