package challenges.fizzbuzz;

import java.util.Arrays;
import java.util.List;

public class FizzBuzzTest {

    public FizzBuzzTest() {
        System.out.println("==== TEST FizzBuzz ====");
    }

    public void success_have_only_fizz() {
        System.out.println("[SUCCESS] Have only Fizz");
        // arrange
        int number = 4;
        List<String> expect = Arrays.asList("1", "2", "Fizz", "4");
        // action
        List<String> actual = FizzBuzz.process(number);
        // assert
        System.out.println(expect.equals(actual));
        System.out.println(" ");
    }

    public void success_have_both_fizz_and_buzz() {
        System.out.println("[SUCCESS] Have both Fizz and Buzz");
        // arrange
        int number = 5;
        List<String> expect = Arrays.asList("1", "2", "Fizz", "4", "Buzz");
        // action
        List<String> actual = FizzBuzz.process(number);
        // assert
        System.out.println(expect.equals(actual));
        System.out.println(" ");
    }

    public void success_have_fizz_and_buzz_and_fizzbuzz() {
        System.out.println("[SUCCESS] Have both Fizz and Buzz");
        // arrange
        int number = 15;
        List<String> expect = Arrays.asList("1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11",
                "Fizz", "13", "14", "FizzBuzz");
        // action
        List<String> actual = FizzBuzz.process(number);
        // assert
        System.out.println(expect.equals(actual));
        System.out.println(" ");
    }
}
