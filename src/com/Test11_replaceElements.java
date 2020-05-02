package com;

/**
 * 给你一个数组 arr ，请你将每个元素用它右边最大的元素替换，如果是最后一个元素，用 -1 替换。
 */
public class Test11_replaceElements {
    public static void main(String[] args) {


    }

    public int[] replaceElements(int[] arr){

        int[] nums = new int[arr.length];

        for(int i=0;i<arr.length;i++){
            int k = arr[i+1];
            for(int j=i+1;j<arr.length;j++){

                if(j == arr.length-1){
                    k = -1;
                }

                if(arr[j+1] > arr[j]){
                    k = arr[j+1];
                }
            }
            nums[i] = k;
        }

        return nums;
    }
}



















