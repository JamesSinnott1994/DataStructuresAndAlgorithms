import java.util.Arrays;

public class BubbleSort {

    public static void runBubbleSortAlgorithm() {

        int[] my_array = {64, 34, 25, 12, 22, 11, 90, 5}; // Size = 8

        int n = my_array.length;

        // Go through the array as many times as there are values in the array
        for (int i = 0; i < n-1; i++) {

            for (int j = 0; j < n-i-1; j++) {

                if (my_array[j] > my_array[j+1]) {
                    int valueToLeft = my_array[j];
                    int valueToRight = my_array[j+1];
                    my_array[j] = valueToRight;
                    my_array[j+1] = valueToLeft;
                }

            } // End inner for loop

        } // End outer for loop

        // Print out array
        System.out.println(Arrays.toString(my_array));
    }

    public static void runBubbleSortAlgorithmImproved() {

        // Where the array is mostly sorted already
        int[] my_array = {7, 3, 9, 12, 11}; // Size = 8

        int n = my_array.length;

        // Go through the array as many times as there are values in the array
        for (int i = 0; i < n-1; i++) {
            boolean swapped = false;

            for (int j = 0; j < n-i-1; j++) {

                if (my_array[j] > my_array[j+1]) {
                    int valueToLeft = my_array[j];
                    int valueToRight = my_array[j+1];
                    my_array[j] = valueToRight;
                    my_array[j+1] = valueToLeft;
                    swapped = true;
                }

                if (!swapped) {
                    break; // As the array is already sorted
                }

            } // End inner for loop

        } // End outer for loop

        // Print out array
        System.out.println(Arrays.toString(my_array));
    }
}
