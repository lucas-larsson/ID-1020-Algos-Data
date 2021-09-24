package KTH.ID1020;
import java.util.Arrays;
/**
 * Author:      LUCAS LARSSON
 * Date:        2021-09-20
 * Description: A Class containing the algorithm insertion sort.
 **/
public class InsertionSort {

    // a void method to sort an array using insertion sort.
   static void  sort (int[] array){
       int swapCount = 0;
        for (int i= 1; i < array.length ; i++){
            int key = array[i];
            int j = i - 1;

            // inner loop, preforms a swap everytime the element is grater than the key.
            while ( j >= 0 && array[j] > key ){
                array [j+1] = array [j];
                j = j - 1 ;
                swapCount ++;
                System.out.println(Arrays.toString(array));
            }
            array [ j + 1 ] = key;
        }
       System.out.println("Number of swaps:  "+ swapCount);
    }
}