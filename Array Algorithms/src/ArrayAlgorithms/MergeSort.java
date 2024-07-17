package ArrayAlgorithms;

import java.util.ArrayList;
import java.util.List;

public class MergeSort {

    public static void runMergeSortAlgorithm() {

        List<Double> unsortedArr = new ArrayList<>();
        unsortedArr.add(3.0);
        unsortedArr.add(7.0);
        unsortedArr.add(6.0);
        unsortedArr.add(-10.0);
        unsortedArr.add(15.0);
        unsortedArr.add(23.5);
        unsortedArr.add(55.0);
        unsortedArr.add(-13.0);

        List<Double> sortedArr = mergeSort(unsortedArr);
        System.out.println("Sorted array: " + sortedArr);

    }

    public static List<Double> merge(List<Double> left, List<Double> right) {
        List<Double> result = new ArrayList<>();
        int i = 0, j = 0;

        while (i < left.size() && j < right.size()) {
            if (left.get(i) < right.get(j)) {
                result.add(left.get(i));
                i++;
            } else {
                result.add(right.get(j));
                j++;
            }
        }

        while (i < left.size()) {
            result.add(left.get(i));
            i++;
        }

        while (j < right.size()) {
            result.add(right.get(j));
            j++;
        }

        return result;
    }

    public static List<Double> mergeSort(List<Double> arr) {
        int step = 1;  // Starting with sub-arrays of length 1
        int length = arr.size();

        while (step < length) {
            for (int i = 0; i < length; i += 2 * step) {
                List<Double> left = arr.subList(i, Math.min(i + step, length));
                List<Double> right = arr.subList(Math.min(i + step, length), Math.min(i + 2 * step, length));

                List<Double> merged = merge(left, right);

                // Place the merged array back into the original array
                for (int j = 0; j < merged.size(); j++) {
                    arr.set(i + j, merged.get(j));
                }
            }
            step *= 2;  // Double the sub-array length for the next iteration
        }

        return arr;
    }

}
