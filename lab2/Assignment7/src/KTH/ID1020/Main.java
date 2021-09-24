package KTH.ID1020;

import java.util.*;

/**
 * Author:      LUCAS LARSSON
 * Date:        2021-09-20
 * Description: Main class that handles thw io to the insertion algorithm.
 **/
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);          // Scanner

        System.out.println("insert size of the desired array");
        int size = scanner.nextInt();
        int[] toBeSorted = new int[size];                   // input size

        System.out.println("insert the elements to be sorted ");
        for(int i = 0; i< toBeSorted.length; i++){          // a loop that scans the inserted elements and save them
            toBeSorted[i]=scanner.nextInt();                // in the respective index
        }
        System.out.println(Arrays.toString(toBeSorted));    // print pre sort
        InsertionSortReverse.revSort(toBeSorted);
        System.out.println(Arrays.toString(toBeSorted));    // print post sort
    }
}
