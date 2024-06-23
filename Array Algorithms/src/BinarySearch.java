public class BinarySearch {

    public static void runBinarySearchAlgorithm() {

        int[] array = {1, 3, 5, 7, 9, 11, 13, 15, 17}; // Size = 9
        int targetValue = 15;

        int result = binarySearch(array, targetValue);

        if (result != -1) {
            System.out.println("Value: " + targetValue + " found at index " + result);
        } else {
            System.out.println("Target not found in array.");
        }

    }

    public static int binarySearch(int[] array, int targetValue) {

        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int middle = (left + right) / 2;

            if (array[middle] == targetValue) {
                return middle;
            }

            if (array[middle] < targetValue) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return - 1;
    }
}
