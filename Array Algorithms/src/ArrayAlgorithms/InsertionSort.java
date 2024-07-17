package ArrayAlgorithms;

import java.util.ArrayList;
import java.util.List;

public class InsertionSort {

    public static void runInsertionSortAlgorithm() {

        List<Integer> myList = new ArrayList<>();
        myList.add(64);
        myList.add(34);
        myList.add(25);
        myList.add(12);
        myList.add(22);
        myList.add(11);
        myList.add(90);
        myList.add(5);

        int n = myList.size();

        for (int i = 1; i < n; i++) {
            int insertionIndex = i;
            int currentValue = myList.remove(i);

            // Will find the smallest sorted number that is greater than the current number
            for (int j = i-1; j >= 0; j--) {
                if (myList.get(j) > currentValue) {
                    insertionIndex = j;
                }
            }
            myList.add(insertionIndex, currentValue);
        }

        System.out.println(myList);

    }

    public static void runInsertionSortImprovedAlgorithm() {

        List<Integer> myList = new ArrayList<>();
        myList.add(64);
        myList.add(34);
        myList.add(25);
        myList.add(12);
        myList.add(22);
        myList.add(11);
        myList.add(90);
        myList.add(5);

        int n = myList.size();

        for (int i = 1; i < n; i++) {
            int insertionIndex = i;
            int currentValue = myList.get(i);

            // Will find the smallest sorted number that is greater than the current number
            for (int j = i-1; j >= 0; j--) {
                if (myList.get(j) > currentValue) {
                    myList.set(j+1, myList.get(j));
                    insertionIndex = j;
                } else {
                    break;
                }
            }
            myList.set(insertionIndex, currentValue);
        }

        System.out.println(myList);

    }

}
