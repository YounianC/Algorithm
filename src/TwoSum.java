import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2017/7/12.
 */
public class TwoSum {
    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        int[] nums = {3, 3};
        int[] res = twoSum.twoSum(nums, 6);
        System.out.print("" + res[0] + " " + res[1]);
    }

    /*public int[] twoSum(int[] nums, int target) {
        int i = 0, j = 0;
        for (i = 0; i < nums.length; i++) {
            for (j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{i, j};
    }*/

    public int[] twoSum(int[] nums, int target) {
        int i = 0;
        if (nums.length == 2)
            return new int[]{0, 1};
        Map<Integer, Integer> map = new HashMap();
        for (i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i]) && map.get(target - nums[i]) != i) {
                return new int[]{i, map.get(target - nums[i])};
            }
        }
        return new int[]{0, 0};
    }
}
