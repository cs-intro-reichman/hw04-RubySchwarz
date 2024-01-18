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
        return secondMax;
    }

    public static boolean containsTheSameElements(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        java.util.Arrays.sort(array1);
        java.util.Arrays.sort(array2);
        return java.util.Arrays.equals(array1, array2);
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
