package challenges;

import java.util.List;

public class BirthdayCakeCandlesTest {

    BirthdayCakeCandles cakeCandles = new BirthdayCakeCandles();

    public BirthdayCakeCandlesTest() {
        System.out.println("======= Cake Candle ==========");
    }

    public void test() {
        List<Integer> candles = List.of(3, 2, 1, 3);
        Integer actual = cakeCandles.birthdayCakeCandles(candles);

        System.out.printf("Result: %b, expect: %d, actual: %d", 2 == actual, 2, actual);
    }
}
