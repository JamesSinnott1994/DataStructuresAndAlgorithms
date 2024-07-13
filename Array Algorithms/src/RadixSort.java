import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RadixSort {

    public static void runRadixSortAlgorithm() {

        List<Integer> myList =
                new ArrayList<>(Arrays.asList(170, 45, 75, 90, 802, 24, 2, 66));

        System.out.println("Original list: " + myList);

        // Initialize radixArray with ten empty ArrayLists
        /*
         The square brackets [] denote that radixArray is an array,
         and each element of this array is an ArrayList<Integer>
         */
        ArrayList<Integer>[] radixArray = new ArrayList[10];
        for (int i = 0; i < 10; i++) {
            radixArray[i] = new ArrayList<>();
        }

        // Get maximum value to know the number of digits
        int maxValue = Collections.max(myList);

        // This is the "exponent"
        // It denotes the current digit's place value that is being processed
        int exp = 1;

        // Perform radix sort
        while (maxValue / exp > 0) {

            // Distribute elements into buckets
            while (myList.size() > 0) {
                int value = myList.remove(myList.size()-1);
                int radixIndex = (value / exp) % 10;
                radixArray[radixIndex].add(value);
            }

            // Gather elements back into list
            for (ArrayList<Integer> bucket : radixArray) {
                while (bucket.size() > 0) {
                    int value = bucket.remove(bucket.size()-1);
                    myList.add(value);
                }
            }

            // Move to the next digit
            exp *= 10;
        }
        System.out.println("Sorted array: " + myList.toString());
    }

}
