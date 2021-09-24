/**
 * Author:      LUCAS LARSSON
 * Date:        2021-09-20
 * Description:a header file, see the original .c file
 **/

#ifndef ASSIGNMENT3_SORT_H
#define ASSIGNMENT3_SORT_H

#endif //ASSIGNMENT3_SORT_H

void swap(int array[], int i, int j)
{
    int temp = array[i];
    array[i] = array[j];
    array[j] = temp;
}
void sort (int array[], int len){
    int j = 0;
    int l = len - 1;
    for(int i = 0; i <= l ; i++){
        int current = array[i];
        if(current < 0)
        {
            swap(array, i, j);
            j++;
        }
        else if (current > 0)
        {
            swap(array, i, l);
            l--;
            i--;
        }
    }
}