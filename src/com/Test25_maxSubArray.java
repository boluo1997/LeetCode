package com;

/**
 * 最大子序和
 *
 * 给定一个整数数组 nums ，
 * 找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 *
 * 先定义一个result  再定义一个sum
 * result代表当前子序的和,sum代表+1之后位置的子序和,谁大就选谁
 *
 * 因为他要的是结果数值,而不用记录是哪几个数组成的最大子序
 * 所以我们只需要记录sum+=nums[j]之后的值就可以
 * 然后和上一位的和进行比较
 * 也就是说result一直在存储着当前的最大子序和,而sum是+1之后的子序和
 * 因为这里用的是sum+=nums[j] 所以sum也就是存储的是前面的累计的值,而不是当前和下一个这两个的值
 */
public class Test25_maxSubArray {
    public static void main(String[] args) {

    }

    public static int maxSubArray(int[] nums) {

        int result = Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++){

            int sum = 0;
            for(int j=i;j<nums.length;j++){
                result = Math.max(result,sum+=nums[j]);

            }
        }
        return result;
    }
}
