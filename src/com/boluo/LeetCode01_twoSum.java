package boluo;

import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target 的那两个整数，
 * 并返回它们的数组下标。
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
 * 你可以按任意顺序返回答案。
 * <p>
 * 输入：nums = [2,7,11,15], target = 9
 * 输出：[0,1]
 * 解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。
 */
public class LeetCode01_twoSum {
    public static void main(String[] args) {
        int[] nums = new int[]{2, 7, 11, 15};
        System.out.println(twoSum(nums, 9));
    }

    public static int[] twoSum(int[] nums, int target) {
        //维护一个哈希表, key是数字, value为下标,
        // 遍历数组, 判断(目标值-当前数)的值是否存在哈希表里,
        // 存在则返回对应的下标, 不存在则把当前数字放入哈希表
        Map<Integer, Integer> hashMap = new HashMap();

        for (int i = 0; i < nums.length; i++) {
            int another = target - nums[i];
            boolean isExist = hashMap.containsKey(another);
            if (isExist) {
                return new int[]{hashMap.get(another), i};
            }
            hashMap.put(nums[i], i);
        }
        return new int[]{};
    }
}

