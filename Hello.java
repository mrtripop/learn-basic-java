import challenges.birthdaycakecandles.BirthdayCakeCandles;
import challenges.birthdaycakecandles.BirthdayCakeCandlesTest;
import challenges.calendar.BasicCalendarTest;
import challenges.fizzbuzz.FizzBuzzTest;
import challenges.javaSHA256.JavaSHA256Test;
import challenges.javaStringCompare.JavaStringCompare;
import challenges.javaStringCompare.JavaStringCompareTest;
import challenges.palindrome.PalindromeTest;
import challenges.twosum.TwoSumTest;

public class Hello {

    public static void main(String[] arg) {
        // byte b = 125;
        // int a = b; // auto conversion
        // System.out.println(a);

        // byte c = (byte) a; // explicit conversion
        // System.out.println(c);

        // float f = 5.6f;
        // int t = (int) f; // float will loose decimal point
        // System.out.println(t);

        // // out of byte
        // byte bya = 10;
        // byte byb = 30;
        // // if use 'byte', it will throws out of range.
        // // so, use 'int' to store value of cal is okay.
        // int result = a * b;
        // System.out.println(result);

        TwoSumTest twoSumTestcase = new TwoSumTest();
        twoSumTestcase.success_found_index_of_two_sum_for_the_target();
        twoSumTestcase.failed_not_found_index_of_two_sum_for_the_target();
        twoSumTestcase.success_found_index_of_two_sum_for_the_target_when_list_is_large();

        PalindromeTest palindromeTestcase = new PalindromeTest();
        palindromeTestcase.success_the_input_number_is_palindrome();
        palindromeTestcase.failed_the_input_number_is_not_palindrome();

        FizzBuzzTest fizzBuzzTestcase = new FizzBuzzTest();
        fizzBuzzTestcase.success_have_only_fizz();
        fizzBuzzTestcase.success_have_both_fizz_and_buzz();
        fizzBuzzTestcase.success_have_fizz_and_buzz_and_fizzbuzz();

        BasicCalendarTest basicCalendarTest = new BasicCalendarTest();
        basicCalendarTest.testFindDay_month8_day5_year2015_expectWEDNESDAY();
        basicCalendarTest.testFindDay_month8_day14_year2017_expectMONDAY();

        BirthdayCakeCandlesTest birthdayCakeCandlesTest = new BirthdayCakeCandlesTest();
        birthdayCakeCandlesTest.test();

        JavaStringCompareTest javaStringCompareTest = new JavaStringCompareTest();
        javaStringCompareTest.testWelcomeToJava();
        javaStringCompareTest.testHelloWorldJava();
        javaStringCompareTest.testLongText();

        JavaSHA256Test javaSHA256Test = new JavaSHA256Test();
        javaSHA256Test.testCryptographicHash_hashHelloWorld();
    }

}