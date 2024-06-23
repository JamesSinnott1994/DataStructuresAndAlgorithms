public class LinearSearch {

    public static void runLinearSearchAlgorithm() {

        int[] array = {3, 7, 2, 9, 5};
        int targetValue = 9;

        int result = linearSearchAlgorithm(array, targetValue);

        if (result != -1) {
            System.out.println("Value: " + targetValue + " found at index " + result);
        } else {
            System.out.println("Value " + targetValue + " not found");
        }

    }

    public static int linearSearchAlgorithm(int[] array, int targetValue) {

        /*
        Has a runtime complexity of O(n)
         */

        // Linear Search algorithm
        for (int i = 0; i < array.length; i++) {
            if (array[i] == targetValue) {
                return i;
            }
        }
        return -1;
    }

}
