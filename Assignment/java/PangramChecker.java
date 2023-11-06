public class PangramChecker {
    public static boolean isPangram(String input) {
        // Create a boolean array to mark the presence of each letter
        boolean[] alphabet = new boolean[26];

        // Convert the input to lowercase to handle both uppercase and lowercase letters
        input = input.toLowerCase();

        // Iterate through the characters of the input
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            // Check if the character is a lowercase letter
            if (ch >= 'a' && ch <= 'z') {
                // Mark the presence of the letter in the alphabet array
                alphabet[ch - 'a'] = true;
            }
        }

        // Check if all letters in the alphabet array have been marked
        for (boolean present : alphabet) {
            if (!present) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String input = "The quick brown fox jumps over the lazy dog";
        boolean result = isPangram(input);

        if (result) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }
}
