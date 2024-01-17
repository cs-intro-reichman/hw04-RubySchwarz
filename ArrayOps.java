public class ArrayOps {

    public static void main(String[] args) {
        // Test the methods with example data
        System.out.println(secondMaxValue(new int[]{2, 8, 3, 7, 8}));  // Expected: 8
    }
    
    // Method to find the missing integer in an array
    public static int findMissingInt(int[] array) {
        int n = array.length;
        int totalSum = n * (n + 1) / 2;
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return totalSum - sum;
    }

    // Revised method to find the second maximum value in an array
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

        // In case the largest number appears more than once
        if (secondMax == Integer.MIN_VALUE) {
            return max;
        }

        return secondMax;
    }

    // Method to check if two arrays contain the same elements
    public static boolean containsTheSameElements(int[] array1, int[] array2) {
        java.util.HashSet<Integer> set1 = new java.util.HashSet<>();
        for (int num : array1) {
            set1.add(num);
        }

        java.util.HashSet<Integer> set2 = new java.util.HashSet<>();
        for (int num : array2) {
            set2.add(num);
        }

        return set1.equals(set2);
    }

    // Method to check if an array is sorted
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
}
