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
            //break A;
            //为什么把break:A;放这里 结果会是9669;
        }

        int result = Integer.parseInt(String.valueOf(nums));
        return result;
    }
}
