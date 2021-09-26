/**
 * Author:      LUCAS LARSSON
 * Date:        2021-09-20
 * Description: a sorting algorithm that sorts positive and negative integers
 **/
 // swap method, takes input of an array and the
 // positions desired to swap and swap them
void swap(int array[], int i, int j)
{
    int temp = array[i];
    array[i] = array[j];
    array[j] = temp;
}

// a sorting method that takes an input of an array and its length
// the method order the integers negative left bound and positive right bound
// with no regard to the values of the elements.
void sort (int array[], int len){
    int j= 0;                               // Declared variables
    int l = len - 1;
    // O(n) time
    for(int i = 0; i <= l ; i++){           // not working when i < len???
        int current = array[i];
        if(current < 0)                      // if negative swap left bound pointer
        {
            swap(array, i, j);
            j++;
        }
            else if(current > 0)            // if positive swap right bound pointer
        {
            swap(array, i, l);
            l--;
            i--;
        }
    }
}
