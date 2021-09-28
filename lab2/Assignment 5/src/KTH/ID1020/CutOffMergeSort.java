package KTH.ID1020;
/**
 * Author:      LUCAS LARSSON
 * Date:        2021-09-26
 * Description: merge sort with the cut-off method to insertion sort
 **/
 class CutOffMergeSort {
        private static int[] aux;
        public static void sort(int[] array, int cutOff) {
            aux = new int[array.length];
            sort(array, 0, array.length - 1, cutOff);
        }

        private static void sort(int[] array, int lo, int hi, int cutOff) {

            if (hi <= lo + cutOff){
                InsertionSort.insertionSort(array);
                return;                         // return after the list is sorted
            }
            if (hi <= lo) return;               // base case
            int mid = lo + (hi - lo)/2;         // dived the array
            sort(array, lo, mid, cutOff);       // lower half
            sort(array, mid+1, hi, cutOff);  // top half
            merge(array, lo, mid, hi);
        }
        // (copied from page 271).
        static void merge(int[] array, int lo, int mid, int hi){
            // Merge array[lo..mid] with array[mid+1..hi].
            int i = lo, j = mid+1;

            // Copy array[lo..hi] to aux[lo..hi].

            // for(int k = lo; k <= hi; k++)
            //   aux[k] = array[k];

            // one statement instead of the loop above
            if (hi + 1 - lo >= 0) System.arraycopy(array, lo, aux, lo, hi + 1 - lo);

            // Merge back to a[lo..hi].
            for (int k = lo; k <= hi; k++){
                if ( i > mid) array[k]= aux[j++];
                else if (j > hi) array[k] = aux[i++];
                else if (aux[j] < aux[i]) array[k] = aux[j++];
                else array[k] = aux [i++];
            }
        }
 }