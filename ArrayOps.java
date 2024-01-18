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
    public static int secondMaxValue(int[] arr) {
         int firstMax = Integer.MIN_VALUE;
         int secondMax = Integer.MIN_VALUE;
    
         for (int num : arr) {
            if (num > firstMax) {
                 secondMax = firstMax;
                 firstMax = num;
            } else if (num > secondMax && num < firstMax) {
                secondMax = num;
        }
    }
    
    return secondMax;
}


    // Corrected Method to check if two arrays contain the same unique elements
    public static boolean containsTheSameElements(int[] array1, int[] array2) {
        java.util.Set<Integer> set1 = new java.util.HashSet<>();
        java.util.Set<Integer> set2 = new java.util.HashSet<>();

        for (int num : array1) {
            set1.add(num);
        }
        for (int num : array2) {
            set2.add(num);
        }

        return set1.equals(set2);
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
