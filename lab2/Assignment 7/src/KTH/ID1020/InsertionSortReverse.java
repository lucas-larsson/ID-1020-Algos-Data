package KTH.ID1020;

/**
 * Author:      LUCAS LARSSON
 * Date:        2021-09-23
 * Description: an insertion sort algorithm that sorts the elements in descending order
 **/
public class InsertionSortReverse {
    static void revSort (int [] array) {

        // first loop that multiply the elements of the list with -1
        for( int i = 0; i < array.length; i++) array[i] *= -1 ;
        // first loop in the sorting algorithm
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;
            
            // inner loop, preforms a swap everytime the element is grater than the key.
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
               //System.out.println(Arrays.toString(array));
            }
            array[j + 1] = key;
        }

        // second loop that multiply the element again to revert them to their original value
         for( int i = 0; i < array.length; i++) array[i] *= -1;
    }
}
