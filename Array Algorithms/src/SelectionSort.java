import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SelectionSort {

    public static void runSelectionSortAlgorithm() {

        List<Integer> my_list = new ArrayList<Integer>(); // Size = 8
        my_list.add(64);
        my_list.add(34);
        my_list.add(25);
        my_list.add(5);
        my_list.add(22);
        my_list.add(11);
        my_list.add(90);
        my_list.add(12);

        int n = my_list.size();

        for (int i = 0; i < n-1; i++) {

            int min_index = i;

            for (int j = i+1; j < n; j++) {

                if (my_list.get(j) < my_list.get(min_index)) {
                    min_index = j;
                }

            } // End inner for loop
            int min_value = my_list.remove(min_index);
            my_list.add(i, min_value);

        } // End outer for loop

        // Print out array
        System.out.println(my_list);
    }

    public static void runImprovedSelectionSortAlgorithm() {

        // No shifting of list elements here

        List<Integer> my_list = new ArrayList<Integer>(); // Size = 8
        my_list.add(64);
        my_list.add(34);
        my_list.add(25);
        my_list.add(5);
        my_list.add(22);
        my_list.add(11);
        my_list.add(90);
        my_list.add(12);

        int n = my_list.size();

        for (int i = 0; i < n-1; i++) {

            int min_index = i;

            for (int j = i+1; j < n; j++) {

                if (my_list.get(j) < my_list.get(min_index)) {
                    min_index = j;
                }

            } // End inner for loop

            int min_value = my_list.get(min_index);
            int valueToBeSwapped = my_list.get(i);
            my_list.set(i, min_value);
            my_list.set(min_index, valueToBeSwapped);

        } // End outer for loop

        // Print out array
        System.out.println(my_list);
    }

}
