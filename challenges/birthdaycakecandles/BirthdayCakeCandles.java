package challenges.birthdaycakecandles;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BirthdayCakeCandles {

    /**
     * Challenge:
     * https://www.hackerrank.com/challenges/birthday-cake-candles/problem?utm_campaign=challenge-recommendation&utm_medium=email&utm_source=24-hour-campaign
     * 
     * @param candles
     * @return
     */
    public static int birthdayCakeCandles(List<Integer> candles) {
        Integer highestNumber = 0;
        Map<Integer, Integer> counter = new HashMap<>();
        for (Integer candle : candles) {
            if (candle > highestNumber) {
                highestNumber = candle;
            }
            Integer curr = counter.get(candle);
            if (curr == null) {
                curr = 0;
            }
            counter.put(candle, curr + 1);
        }
        return counter.get(highestNumber);
    }

}
