package challenges.fizzbuzz;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    private FizzBuzz() {
    }

    public static List<String> process(int number) {
        List<String> result = new ArrayList<>();
        for (int i = 1; i <= number; i++) {
            boolean isFizz = i % 3 == 0;
            boolean isBuzz = i % 5 == 0;
            if (isFizz && isBuzz) {
                result.add("FizzBuzz");
            } else if (isFizz) {
                result.add("Fizz");
            } else if (isBuzz) {
                result.add("Buzz");
            } else {
                result.add(String.valueOf(i));
            }
        }
        System.out.println(result.toString());
        return result;
    }
}
