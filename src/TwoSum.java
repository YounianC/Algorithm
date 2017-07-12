/**
 * Created by Administrator on 2017/7/12.
 */
public class TwoSum {
    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        int[] nums = {2, 7, 11, 15};
        int[] res = twoSum.twoSum(nums, 9);
        System.out.print("" + res[0] + " " + res[1]);
    }

    public int[] twoSum(int[] nums, int target) {
        int i = 0, j = 0;
        for (i = 0; i < nums.length; i++) {
            for (j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{i, j};
    }
}
