#include <stdio.h>
#include <ctype.h>
#include <stdlib.h>
// Program not working, check other file written in java 
 void main() {
    printf("\n");

    FILE *read_from;
    FILE *write_to;
    int num;

    read_from = fopen("98-0.txt", "r");      // open file
    write_to = fopen("output.txt", "w");     // create file

     if(read_from == NULL){
         printf("Error: could not open the file");
         return ;
     }
     int c;
     while (fgetc(read_from) != EOF){
         c = fgetc(read_from);
         while (isalpha(c) && c != '\n'){
             fprintf(write_to,"%d",c);
         }
     }
     fclose(read_from);
     fclose(write_to);
}
