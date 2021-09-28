package KTH.ID1020;
import java.util.Scanner;
/**
 * Author:      LUCAS LARSSON
 * Date:        2021-09-24
 * Description: Main class to handle the IO  to and from the two different algorithms .
 **/

public class Main {
    public static void main(String[] args) {

        // declaring variables
        long startTime = 0;
        long endTime = 0;
        long duration1 = 0;
        long duration2= 0;
        long difference;

        // scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("insert size of the list to be sorted ");

        //scans for the size of the list to be sorted and creates it
        int size = sc.nextInt();
        int []array = new int[size];

        // inserts the elements randomly to the list
        int temp = 0;
        for (int i = 0; i < size ; i++ ){
           temp = (int) (Math.random()*100);
            array[i]= temp;
        }

        // run the algorithm and measure its execution time
        startTime = System.currentTimeMillis();
        M3QuickSort.sort(array);
        endTime = System.currentTimeMillis();
        duration1 = endTime - startTime;

        startTime = System.currentTimeMillis();
        QuickSort.sort(array);
        endTime = System.currentTimeMillis();
        duration2 = endTime - startTime;

        // calculate the difference for given amount of data
        difference = duration2 - duration1;

        System.out.println("sort with the median-of-three partitioning method: " +duration1+ " ms");
        System.out.println("sort with the first sub-Array element partitioning "+duration2+"ms");
        System.out.println("the first method is faster than the second with: "+difference+"ms   for the size of "+size);
    }
}
