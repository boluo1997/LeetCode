package boluo;

/**
 * 整数的各位积和之差
 * 给你一个整数 n，请你帮忙计算并返回该整数「各位数字之积」与「各位数字之和」的差。
 */
public class LeetCode1281_subtractProductAndSum {

    public int subtractProductAndSum(int n) {
        int sum = 0;
        int product = 1;

        while (n > 0) {

            int num = n % 10;
            product *= num;
            sum += num;
            n = n / 10;
        }

        return product - sum;
    }
}
