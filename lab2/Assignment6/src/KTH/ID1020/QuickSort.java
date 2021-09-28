package KTH.ID1020;
/**
 * Author:      LUCAS LARSSON
 * Date:        9/24/2021
 * Description: A quick sort algorithm class
 *
 * Disclaimer: this algorithm is copied from the course literature page 289 and 291
 **/

class QuickSort {
    public static void sort(int[] a) {
        StdRandom.shuffle(a);
        sort(a,0,a.length-1);
    }

    private static void sort(int[] a, int lo, int hi){
        if( hi <= lo) return;
        int j = partition(a, lo, hi);
        sort(a, lo, j-1);
        sort(a, j+1, hi);
    }

    private static int partition(int[] a, int lo, int hi) {
        int i= lo, j = hi+1;
        int v = a[lo];
        while (true){
            while(a[++i] < v) if (i == hi) break;
            while(v < a[--j]) if (j == lo) break;
            if (i >= j) break;

            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
        int temp = a[lo];       // Put v = a[j] into position
        a[lo] = a[j];
        a[j] = temp;
        return j;               // with a[lo..j-1] <= a[j] <= a[j+1..hi].
    }
}