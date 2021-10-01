#include <stdio.h>
#include <ctype.h>
#include <stdlib.h>

 void main() {
    printf("Cuz Linus mama!\n");

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
     /*
     while (fgetc(read_from) != EOF){
         if (isalpha(fgetc(read_from)) && fgetc(read_from) !=  '\n'){
             putc(fgetc(read_from),write_to);
         } else {
             putc(' ',write_to );
         }
        // ' '
     }
      */
     fclose(read_from);
     fclose(write_to);
}