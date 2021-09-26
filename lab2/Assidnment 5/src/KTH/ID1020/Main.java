package KTH.ID1020;

import java.util.Scanner;

/**
 * Author:      LUCAS LARSSON
 * Date:        2021-09-20
 * Description: Main class to handle the IO to and from the algorithm .
 **/

public class Main {

    public static void main(String[] args) {
        long startTime = 0;
        long endTime = 0;
        long duration = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Insert size of the desired array");
        int size = sc.nextInt();
        int[] toBeSorted = new int[size];

        System.out.println("insert cut-off");
        int cutOff = sc.nextInt();

        // inserts the elements randomly to the list
        int temp = 0;
        for (int i = 0; i < size ; i++ ){
            temp = (int) (Math.random()*100);
            toBeSorted[i]= temp;
        }
        // run the algorithm and measure its execution time
        startTime = System.currentTimeMillis();
        CutOffMergeSort.sort(toBeSorted,cutOff);
        endTime = System.currentTimeMillis();
        duration = endTime - startTime;
        System.out.println(duration+" ms to sort an array of the size: " +size+ " with a cut off of: " + cutOff);
    }
}
