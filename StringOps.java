public class StringOps {
    // Add methods here according to the skeleton

    // Function to capitalize vowels and lowercase other characters
    public static String capVowelsLowRest(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if ("AEIOUaeiou".indexOf(ch) >= 0) {
                result.append(Character.toUpperCase(ch));
            } else {
                result.append(Character.toLowerCase(ch));
            }
        }
        return result.toString();
    }

    // Function to convert string into camelCase
    public static String camelCase(String str) {
        StringBuilder result = new StringBuilder();
        boolean newWord = true;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ' ') {
                newWord = true;
            } else if (newWord) {
                result.append(i == 0 ? Character.toLowerCase(ch) : Character.toUpperCase(ch));
                newWord = false;
            } else {
                result.append(Character.toLowerCase(ch));
            }
        }
        return result.toString();
    }

    // Function to find all indices of a character in a string
    public static int[] allIndexOf(String str, char ch) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }

        int[] indices = new int[count];
        int index = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                indices[index++] = i;
            }
        }
        return indices;
    }

    public static void main(String[] args) {
        // Test the methods with example data
    }
}
