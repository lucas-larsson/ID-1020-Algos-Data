package KTH.ID1020;
/**
 * Author:      LUCAS LARSSON
 * Date:        2021-09-23
 * Description: a class containing a method that count the numbers of inversions
 * required to sort an array of integers
 *
 * Time Complexity:  O(n^2)
 *   selection with repetition and with no regards to order
 *      (  n+k-1
 *         k      )      ==> (n*(n-1)/2) which evaluates to O(n^2)
 *         k = 2, n = n.
 **/
public class Inversions {
    static void inversionCount (int[] array) {
        int inversionCount = 0;
        for (int i = 0; i < array.length-1; i++)
            for (int j = i + 1; j < array.length; j++)
                if (array[i] > array[j]) {
                    inversionCount++;
                    System.out.println("[" + i + ",[" + array[i] + "]],  [" + j + ",[" + array[j] + "]]");
                }
        System.out.println("Number of inversions " + inversionCount);
       }
}