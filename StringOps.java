public class StringOps {

    // ... [Other methods] ...

    // Revised Function to convert string into camelCase
    public static String camelCase(String str) {
        StringBuilder result = new StringBuilder();
        boolean newWord = false;
        boolean isFirstWord = true;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ' ') {
                newWord = true;
            } else if (newWord) {
                if (isFirstWord) {
                    result.append(Character.toLowerCase(ch));
                    isFirstWord = false;
                } else {
                    result.append(Character.toUpperCase(ch));
                }
                newWord = false;
            } else {
                result.append(isFirstWord ? Character.toLowerCase(ch) : ch);
                isFirstWord = false;
            }
        }
        return result.toString();
    }

    // ... [Other methods] ...

    public static void main(String[] args) {
        // Testing the camelCase method
        System.out.println(camelCase(" tWo    wordS")); // "twoWords"

        // Testing the allIndexOf method
        int[] indices = allIndexOf("Hello world", 'l');
        for (int index : indices) {
            System.out.print(index + " ");
        }
    }
}
