package challenges.palindrome;

public class PalindromeTest {

    public PalindromeTest() {
        System.out.println("==== TEST Palindrome ====");
    }

    public void success_the_input_number_is_palindrome() {
        System.out.println("[SUCCESS] The input number is palindrome");
        // arrange
        int number = 101;
        // action
        boolean actual = Palindrome.isPalindrome(number);
        // assert
        System.out.println(actual);
        System.out.println(" ");
    }

    public void failed_the_input_number_is_not_palindrome() {
        System.out.println("[FAILED] The input number is not palindrome");
        // arrange
        int number = 100;
        // action
        boolean actual = Palindrome.isPalindrome(number);
        // assert
        System.out.println(!actual);
        System.out.println(" ");
    }

}
