// This project demonstrates a simple hashing algorithm in Java, inspired by Java's built-in .hashCode() method. 
// It calculates hash codes for arrays of strings and individual strings using a classic polynomial accumulation approach.

public class HashingAlgorithm {
    public static void main(String[] args) {

        String[] list1 = {"a", "b", "c"};
        String[] list2 = {"a", "b", "d"};

        System.out.println(myArrayHash(list1));
        System.out.println(myArrayHash(list2));

    }

    public static int myArrayHash(String[] arr) {
        if (arr == null) {
            return 0;
        }

        int result = 1;

        for(String element : arr) {
            int elementHash = myStringHash(element);
            result = 31 * result + elementHash;
        }

        return result;
    }

    public static int myStringHash(String str) {
        if (str == null) {
            return 0;
        }

    int hash = 0;
        for (int i = 0; i < str.length(); i++) {
            hash = 31 * hash + str.charAt(i);
        }

        return hash;
    }
}
