package com;


/**
 * 给你一个整数数组 nums 。
 *
 * 如果一组数字 (i,j) 满足 nums[i] == nums[j] 且 i < j ，就可以认为这是一组 好数对 。
 *
 * 返回好数对的数目。
 *
 */

public class Test35_goodNums {
    public int numIdenticalPairs(int[] nums) {

        int sum = 0;
        for(int i=0; i<nums.length; i++){
            for(int j=i+1;j<nums.length; j++){
                if(nums[i] == nums[j] && i < j){
                    sum++;
                }
            }
        }

        return sum;
    }
}
