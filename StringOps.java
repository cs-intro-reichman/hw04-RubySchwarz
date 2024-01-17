public class StringOps {

    public static void main(String[] args) {
        // Test the camelCase method
        System.out.println(camelCase(" tWo    wordS")); // Expected: "twoWords"
    }

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

    // Corrected Function to convert string into camelCase
    public static String camelCase(String str) {
        StringBuilder result = new StringBuilder();
        boolean isNewWord = false;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ' ') {
                if (result.length() == 0) continue; // Skip leading spaces
                isNewWord = true; // Next non-space character starts a new word
            } else {
                if (isNewWord || result.length() == 0) {
                    result.append(result.length() == 0 ? Character.toLowerCase(ch) : Character.toUpperCase(ch));
                    isNewWord = false;
                } else {
                    result.append(Character.toLowerCase(ch));
                }
            }
        }
        return result.toString();
    }

    // Function to find all indices of a character in a string
    public static int[] allIndexOf(String str, char ch) {
        // ... (implementation of allIndexOf)
    }

    // ... (any other methods)
}
