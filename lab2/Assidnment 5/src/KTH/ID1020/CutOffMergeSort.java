package KTH.ID1020;
/**
 * Author:      LUCAS LARSSON
 * Date:        2021-09-26
 * Description: merge sort with the cut-off method to insertion sort
 **/
 class CutOffMergeSort {
        private static int[] aux;
        public static void sort(int[] array, int cutOff)
        {
            StdRandom.shuffle(array);
            aux = new int[array.length];
            sort(array, 0, array.length - 1, cutOff);
        }

        private static void sort(int[] array, int lo, int hi, int cutOff) {

            if (hi <= lo + cutOff)
                InsertionSort.insertionSort(array);

            if (hi <= lo) return;
            int mid = lo + (hi - lo)/2;
            sort(array, lo, mid, cutOff);
            sort(array, mid+1, hi, cutOff);
            merge(array, lo, mid, hi);
        }
        // (copied from page 271).
        static void merge(int[] array, int lo, int mid, int hi){
            int i=lo, j=mid+1;

            // for(int k = lo; k <= hi; k++)
            //   aux[k] = array[k];

            // one statement instead of the loop above
            if (hi + 1 - lo >= 0) System.arraycopy(array, lo, aux, lo, hi + 1 - lo);

            for (int k = lo; k <= hi; k++){
                if ( i > mid) array[k]= aux[j++];
                else if (j > hi) array[k] = aux[i++];
                else if (aux[j] < aux[i]) array[k] = aux[j++];
                else array[k] = aux [i++];
            }
        }
 }

