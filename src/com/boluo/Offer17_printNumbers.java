package boluo;

/**
 * 输入数字 n，按顺序打印出从 1 到最大的 n 位十进制数。
 * 比如输入 3，则打印出 1、2、3 一直到最大的 3 位数 999。
 */
public class Offer17_printNumbers {
    public static void main(String[] args) {

    }

    public int[] printNumbers(int n){
        int[] nums = new int[(int) (Math.pow(10,n)-1)];
        int m = 1;
        for(int i=0;i<nums.length;i++){
            nums[i] = m++;
        }
        return nums;
    }
}
