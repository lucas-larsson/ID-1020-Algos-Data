package KTH.ID1020;

/**
 * Author:      lLUCAS LARSSON
 * Date:        2021-09-26
 * Description: a class containing insertion sort algorithm
 * copied from the course literature page 251
 **/
 class InsertionSort {
        public static void insertionSort(int[] array) {
            for(int i = 1; i < array.length; i++) {
                for(int j = i; j > 0 && array[j] < array[j-1]; j--) {
                    swap(array, j, j-1);
                }
            }
        }
        private static void swap(int[] array, int i, int j){
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
 }

