package com;

import java.util.Arrays;

/**
 * 从前往后找到第一个6 , 把6变成9
 */

public class Test23_maximum69Number {
    public static void main(String[] args) {
        System.out.println(maximum69Number(9669));
    }

    public static int maximum69Number (int num) {
        char[] nums = String.valueOf(num).toCharArray();

        A:for(int i=0;i<nums.length;i++){
            if(nums[i] == '6'){
                nums[i] = '9';
                break A;
            }
        }

        int result = Integer.parseInt(String.valueOf(nums));
        return result;
    }
}
