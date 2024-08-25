package challenges.twosum;

import constant.Constant;

public class TwoSumTest {

    private int[] numbers = Constant.twoSumData();
    private TwoSum twoSum = new TwoSum(numbers);

    public TwoSumTest() {
        System.out.println("==== TEST TwoSum ====");
    }

    public void success_found_index_of_two_sum_for_the_target() {
        System.out.println("[SUCCESS] Found index of two sum for the target");
        // arrange
        int target = 11;
        int[] expect = { 0, 9 };
        // action
        int[] actual = twoSum.calculate(target);
        // assert
        System.out.println(expect[0] == actual[0] && expect[1] == actual[1]);
        System.out.println(" ");
    }

    public void failed_not_found_index_of_two_sum_for_the_target() {
        System.out.println("[FAILED] Not found index of two sum for the target");
        // arrange
        int target = 4000;
        int[] expect = null;
        // action
        int[] actual = twoSum.calculate(target);
        // assert
        System.out.println(expect == actual);
        System.out.println(" ");
    }

    public void success_found_index_of_two_sum_for_the_target_when_list_is_large() {
        System.out.println("[SUCCESS] Found index of two sum for the target when list is large");
        // arrange
        int target = 3999;
        int[] expect = { 1998, 1999 };
        // action
        int[] actual = twoSum.calculate(target);
        // assert
        System.out.println(expect[0] == actual[0] && expect[1] == actual[1]);
        System.out.println(" ");
    }
}
