package HashTables;

public class HashTables {

    public static int hashFunction(String value) {
        int sum = 0;
        for (int i = 0; i < value.length(); i++) {
            sum += value.charAt(i);
        }
        return sum % 10;
    }

}