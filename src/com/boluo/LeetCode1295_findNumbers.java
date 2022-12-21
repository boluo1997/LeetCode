package boluo;

/**
 * 1295. 统计位数为偶数的数字
 * 给你一个整数数组 nums，请你返回其中位数为 偶数 的数字的个数。
 */
public class LeetCode1295_findNumbers {
    public int findNumbers(int[] nums) {

        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            String str = String.valueOf(nums[i]);
            if (str.length() % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
