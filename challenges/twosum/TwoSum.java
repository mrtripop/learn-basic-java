package challenges.twosum;

public class TwoSum {

    private final int[] numbers;

    public TwoSum(int[] numbers) {
        this.numbers = numbers;
    }

    public int[] calculate(int target) {
        for (int i = 0; i < numbers.length; i++) {
            int num1 = numbers[i];
            for (int j = i + 1; j < numbers.length; j++) {
                int num2 = numbers[j];
                int sum = num1 + num2;
                if (sum == target) {
                    return new int[] { i, j };
                }
            }
        }
        return null;
    }
}
