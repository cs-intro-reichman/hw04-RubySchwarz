public class ArrayOps {

    // Corrected Method to find the second maximum value in an array
    public static int secondMaxValue(int[] array) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int num : array) {
            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num > secondMax && num != max) {
                secondMax = num;
            }
        }
        return (secondMax == Integer.MIN_VALUE) ? max : secondMax;
    }

    // Corrected Method to check if two arrays contain the same elements
    public static boolean containsTheSameElements(int[] array1, int[] array2) {
        java.util.Map<Integer, Integer> countMap1 = new java.util.HashMap<>();
        java.util.Map<Integer, Integer> countMap2 = new java.util.HashMap<>();
        for (int num : array1) {
            countMap1.put(num, countMap1.getOrDefault(num, 0) + 1);
        }
        for (int num : array2) {
            countMap2.put(num, countMap2.getOrDefault(num, 0) + 1);
        }
        return countMap1.equals(countMap2);
    }

    // Other methods (findMissingInt, isSorted) remain unchanged

    // Main method
    public static void main(String[] args) {
        // The main method can be used for testing the methods
    }
}
