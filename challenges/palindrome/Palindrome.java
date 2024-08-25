package challenges.palindrome;

public class Palindrome {

    private Palindrome() {
    }

    public static boolean isPalindrome(int number) {
        String numberString = String.valueOf(number);
        int last = numberString.length() - 1;
        for (int first = 0; first < numberString.length() / 2; first++) {
            if (numberString.charAt(first) != numberString.charAt(last - first)) {
                return false;
            }
        }
        return true;
    }

}
