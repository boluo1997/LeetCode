package com;

import java.util.ArrayList;
import java.util.List;

/**
 * 1431.拥有糖果最多的孩子
 *
 * 给你一个数组 candies 和一个整数 extraCandies ，
 * 其中 candies[i] 代表第 i 个孩子拥有的糖果数目。
 *
 * 对每一个孩子，检查是否存在一种方案，
 * 将额外的 extraCandies 个糖果分配给孩子们之后，此孩子有 最多 的糖果。
 *
 */
public class LeetCode1431_kidsWithCandies {
    public static void main(String[] args) {

    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<>(candies.length);

        int max = 0;
        for(int i=0;i<candies.length;i++){
            if(candies[i] >= max){
                max = candies[i];
            }
        }

        for(int i=0;i<candies.length;i++){
            if(candies[i]+extraCandies >= max){
                list.add(true);
            }else {
                list.add(false);
            }
        }

        return list;

    }
}

















