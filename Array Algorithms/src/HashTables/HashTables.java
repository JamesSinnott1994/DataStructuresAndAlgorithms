package HashTables;

import java.util.LinkedList;

public class HashTables {

    public static int hashFunction(String value) {
        int sum = 0;
        for (char c : value.toCharArray()) {
            sum += c;
        }
        return sum % 10;
    }

    public static void add(String value, LinkedList<String>[] myHashSet) {
        int index = hashFunction(value);
        LinkedList<String> bucket = myHashSet[index];

        if (!bucket.contains(value)) {
            bucket.add(value);
        }
    }

    public static boolean contains(String value, LinkedList<String>[] myHashSet) {
        int index = hashFunction(value);
        LinkedList<String> bucket = myHashSet[index];
        return bucket.contains(value);
    }

}