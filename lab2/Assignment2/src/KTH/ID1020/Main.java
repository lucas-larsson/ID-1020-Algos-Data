package KTH.ID1020;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Insert size of the desired array");
        int size = scan.nextInt();
        int[] toBeSorted = new int[size];

        System.out.println("Insert the elements to be sorted");

        for(int i = 0; i < toBeSorted.length ; i++){
            toBeSorted[i] = scan.nextInt();
        }
        System.out.println(Arrays.toString(toBeSorted));
        Inversions.inversionCount(toBeSorted);
        System.out.println(Arrays.toString(toBeSorted));
       //  InsertionSort.sort(toBeSorted);
    }
}