package ArrayAlgorithms;

public class QuickSort {

    /*
    Pivot: the central point, pin, or shaft on which a mechanism turns or oscillates.

    The algorithm works like this:

    1.	Choose a value in the array to be the pivot element.

    2.	Order the rest of the array so that lower values than the pivot element
    are on the left, and higher values are on the right.

    3.	Swap the pivot element with the first element of the higher values so
    that the pivot element lands in between the lower and higher values.

    4.	Do the same operations (recursively) for the sub-arrays on the left and
    right side of the pivot element.

     */

    public static void runQuickSortAlgorithm() {

        int[] myArray = {64, 34, 25, 12, 22, 11, 90, 5};
        quicksort(myArray, 0, myArray.length-1);
        int i = 0;
    }

    private static void quicksort(int[] array, int low, int high) {
        if (low < high) {
            int pivot_index = partition(array, low, high);
            quicksort(array, low, pivot_index-1); // Subarray on left
            quicksort(array, pivot_index+1, high); // Subarray on right
        }
    }

    private static int partition(int[] array, int low, int high) {

        int pivot = array[high]; // Choose the last element of the subarray as the pivot

        // This index will eventually represent the position where the pivot element
        // should be placed after partitioning.
        int i = low - 1;

        // Rearranging the elements
        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {
                i += 1;
                // Swap array[i] and array[j]
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        // The pivot element is swapped with the element at array[i + 1],
        // placing the pivot in its correct sorted position.
        // Swap array[i + 1] and array[high] (or pivot)
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        // Return the pivot index
        return i+1;
    }



}
