public class StringOps {
    // Method to capitalize vowels and lower case the rest
    public static String capVowelsLowRest(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if ("AEIOUaeiou".indexOf(c) >= 0) {
                result.append(Character.toUpperCase(c));
            } else {
                result.append(Character.toLowerCase(c));
            }
        }
        return result.toString();
    }

    // Corrected Method to convert to camel case
    public static String camelCase(String str) {
        StringBuilder result = new StringBuilder();
        boolean nextUpper = false;
        boolean isFirstWord = true;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == ' ') {
                if (result.length() > 0) { // Avoid multiple spaces at the start
                    nextUpper = true;
                }
                continue;
            }

            if (isFirstWord) {
                result.append(Character.toLowerCase(c));
                isFirstWord = false;
            } else if (nextUpper) {
                result.append(Character.toUpperCase(c));
                nextUpper = false;
            } else {
                result.append(Character.toLowerCase(c));
            }
        }
        return result.toString();
    }

    // Method to find all indexes of a given character
    public static int[] allIndexOf(String str, char ch) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }

        int[] indexes = new int[count];
        int idx = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                indexes[idx++] = i;
            }
        }

        return indexes;
    }

    // Main method for testing
    public static void main(String[] args) {
        System.out.println(capVowelsLowRest("Hello World"));
        System.out.println(camelCase("Hello World"));
        System.out.println(java.util.Arrays.toString(allIndexOf("Hello World", 'l')));
    }
}
