package Class11;

public class HW6 {
    public static void main(String[] args) {
        String[] strings = {"aba", "Abbc"};

        for (String string : strings) {

            String lowerCase = string.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");

            boolean isPalindrome = true;
            int len = lowerCase.length();

            for (int i = 0; i < len / 2; i++) {
                if (lowerCase.charAt(i) != lowerCase.charAt(len - i - 1)) {
                    isPalindrome = false;
                    break;
                }
            }

            System.out.println( string + " is a palindrome? " + isPalindrome);
        }
    }
}
