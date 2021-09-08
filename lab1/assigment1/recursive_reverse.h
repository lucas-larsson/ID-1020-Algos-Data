/*
 * Authored by LUCAS LARSSON
 * 08 sep 2021
 * header file, see original C file for more detail
 */

#ifndef LAB1_RECURSIVE_REVERSE_H
#define LAB1_RECURSIVE_REVERSE_H

#endif //LAB1_RECURSIVE_REVERSE_H
#include <stdio.h>
void rec_reverse() {
    char c = getchar();
    if ( c != 0xa ){    // 0xa is hex for "\n" .
        rec_reverse();
        putchar(c);
    }
}