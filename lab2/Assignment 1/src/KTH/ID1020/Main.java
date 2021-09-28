package KTH.ID1020;

import java.util.*;

/**
 * Author:      LUCAS LARSSON
 * Date:        2021-09-20
 * Description: Main class to handle the IO  to and from the insertion algorithm .
 **/

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);     // Scanner
        System.out.println("Insert size of the desired array");
        int size = scan.nextInt();                  // scans for the size of the aray
        int[] toBeSorted = new int[size];

        System.out.println("Insert the elements to be sorted");

        for(int i = 0; i < toBeSorted.length ; i++){ // for loop to scan and insert the elements of the list
            toBeSorted[i] = scan.nextInt();
        }
        System.out.println(Arrays.toString(toBeSorted));    // print pre sort
        InsertionSort.sort(toBeSorted);
        System.out.println(Arrays.toString(toBeSorted));    // print post sort
    }
}
