package boluo;

import java.util.ArrayList;

/**
 * 1313. 解压缩编码列表
 *
 * 给你一个以行程长度编码压缩的整数列表 nums. 考虑每对相邻的两个元素 [freq, val] = [nums[2*i], nums[2*i+1]] （其中 i >= 0 ）,
 * 每一对都表示解压后子列表中有 freq 个值为 val 的元素, 你需要从左到右连接所有子列表以生成解压后的列表。
 * 请你返回解压后的列表。
 */
public class LeetCode1313_decompressRLElist {

    public int[] decompressRLElist(int[] nums) {

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length / 2; i++) {
            for (int j = 0; j < nums[2 * i]; j++) {
                list.add(nums[2 * i + 1]);
            }
        }

        int[] target = new int[list.size()];
        for (int j = 0; j < target.length; j++) {
            target[j] = list.get(j);
        }

        return target;
    }
}
