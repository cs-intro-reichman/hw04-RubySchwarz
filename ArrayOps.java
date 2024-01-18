public class ArrayOps {

    // Method to find the missing integer in an array
    public static int findMissingInt(int[] array) {
        int n = array.length;
        int totalSum = n * (n + 1) / 2;
        int arraySum = 0;
        for (int num : array) {
            arraySum += num;
        }
        return totalSum - arraySum;
    }

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
        java.util.Map<Integer, Integer> countMap = new java.util.HashMap<>();
        for (int num : array1) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        for (int num : array2) {
            if (!countMap.containsKey(num) || countMap.get(num) == 0) {
                return false;
            }
            countMap.put(num, countMap.get(num) - 1);
        }
        for (int count : countMap.values()) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }

    // Method to check if an array is sorted (either increasing or decreasing order)
    public static boolean isSorted(int[] array) {
        boolean increasing = true;
        boolean decreasing = true;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                increasing = false;
            }
            if (array[i] < array[i + 1]) {
                decreasing = false;
            }
        }
        return increasing || decreasing;
    }

    // Main method
    public static void main(String[] args) {
        // The main method can be used for testing the methods
    }
}
