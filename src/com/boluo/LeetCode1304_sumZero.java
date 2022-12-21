package boluo;

/**
 * 和为0的n个整数
 *
 * 给你一个整数 n，请你返回任意一个由n个各不相同的整数组成的数组
 * 并且这 n 个数相加和为 0 。
 *
 */
public class LeetCode1304_sumZero {
    public static void main(String[] args) {

    }

    public int[] sumZero(int n){

        int[] nums = new int[n];

        if(n%2 == 0){   //n为偶数
            int temp = n/2;
            for(int i=0;i<n;i++){
                if(temp == 0){
                    temp=-1;
                }
                nums[i] = temp--;
            }
            return nums;
        }else {         //n为奇数
            int temp = n/2;
            for(int i=0;i<n;i++){
                nums[i] = temp--;
            }
            return nums;
        }
    }

}





















