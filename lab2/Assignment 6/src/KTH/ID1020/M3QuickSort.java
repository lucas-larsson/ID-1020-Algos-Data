package KTH.ID1020;
/**
 * Author:      LUCAS LARSSON
 * Date:        2021-09-24
 * Description: A quick sort class that chooses the pivot with the median of 3 method
 *
 * Disclaimer: this algorithm is copied from the course literature page 289 and 299
**/
class M3QuickSort
{
    public static void sort (int [] array){
        StdRandom.shuffle(array);           // Eliminate dependence on input.
        sort(array,0,array.length-1);
    }
    private static void sort(int [] array, int lo, int hi) {
        // See page 289 for public sort() that calls this method.
        if (hi <= lo) return;
        int lt = lo, i = lo+1, gt = hi;     // left and right scan indices
        int v = array[lo];                  // partitioning item
        while (i <= gt)
        {
            if (array[i] < v)
                swap(array, lt++, i++);
            else if (array[i] > v)
                swap(array, i, gt--);
            else i++;
        } // Now a[lo..lt-1] < v = a[lt..gt] < a[gt+1..hi].
        sort(array, lo, lt - 1);        // Sort left part a[lo .. j-1].
        sort(array, gt + 1, hi);        // Sort right part a[j+1 .. hi].
    }

    private static void swap(int[] array,int left, int right) {
        int tmp      = array[left];
        array[left]  = array [right];
        array[right] = tmp;
    }
}