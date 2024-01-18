public class ArrayOps {
    public static void main(String[] args) {
        // Test the methods with example data
    }

    public static int findMissingInt(int[] array) {
        int n = array.length;
        int totalSum = n * (n + 1) / 2;
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return totalSum - sum;
    }

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
        
        if (secondMax == Integer.MIN_VALUE) {
            return max; // In case all elements are the same
        }

        return secondMax;
    }

    public static boolean containsTheSameElements(int[] array1, int[] array2) {
        java.util.HashMap<Integer, Integer> counts1 = new java.util.HashMap<>();
        for (int num : array1) {
            counts1.put(num, counts1.getOrDefault(num, 0) + 1);
        }

        java.util.HashMap<Integer, Integer> counts2 = new java.util.HashMap<>();
        for (int num : array2) {
            counts2.put(num, counts2.getOrDefault(num, 0) + 1);
        }

        return counts1.equals(counts2);
    }

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
