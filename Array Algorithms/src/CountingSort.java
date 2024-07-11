import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountingSort {

    public static void runCountingSortAlgorithm() {
        ArrayList<Integer> unsortedList = new ArrayList<>();
        unsortedList.add(4);
        unsortedList.add(2);
        unsortedList.add(2);
        unsortedList.add(6);
        unsortedList.add(3);
        unsortedList.add(3);
        unsortedList.add(1);
        unsortedList.add(6);
        unsortedList.add(5);
        unsortedList.add(2);
        unsortedList.add(3);
        List<Integer> sortedList = countingSort(unsortedList);
        System.out.println(sortedList);
    }

    public static ArrayList<Integer> countingSort(ArrayList<Integer> arr) {



        if (arr == null || arr.size() == 0) {
            return arr;
        }

        int max_val = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > max_val) {
                max_val = num;
            }
        }

        int[] count = new int[max_val + 1];

        for (int i = 0; i < arr.size(); i++) {
            int num = arr.remove(i);
            count[num]++;
            i--; // Decrement i because the array size has decreased
        }

        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr.add(i);
                count[i]--;
            }
        }

        return arr;
    }

}
