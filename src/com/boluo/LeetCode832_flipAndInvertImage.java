package boluo;

/**
 * 832.翻转图像
 *
 * 给定一个二进制矩阵 A，我们想先水平翻转图像，然后反转图像并返回结果。
 *
 * 水平翻转图片就是将图片的每一行都进行翻转，即逆序。
 * 例如，水平翻转 [1, 1, 0] 的结果是 [0, 1, 1]。
 *
 * 反转图片的意思是图片中的 0 全部被 1 替换， 1 全部被 0 替换。
 * 例如，反转 [0, 1, 1] 的结果是 [1, 0, 0]。
 *
 *
 */
public class LeetCode832_flipAndInvertImage {
    public static void main(String[] args) {

    }

    public static int[][] flipAndInvertImage(int[][] A){
        int[][] temp = new int[A.length][A[0].length];

        for(int i=0;i<A.length;i++){
            /*for(int j=A[i].length-1;j>=0;j--){
                temp[i][i++] = A[i][j];
            }*/
            for(int j=0;j<A[i].length;j++){
                temp[i][j] = A[i][A[i].length-1-j];
            }
        }

        for(int i=0;i<A.length;i++){
            for(int j=0;j<A[i].length;j++){
                if(temp[i][j] == 0){
                    temp[i][j] = 1;
                }else {
                    temp[i][j] =0;
                }
            }
        }

        return temp;
    }


    //大佬的双指针解法
    public static int[][] flipAndInvertImg(int[][] A){
        //我们研究题意可知  假如之前是 11000   水平翻转之后是00011   图像翻转之后是11100
        //可知前后对应的两个数如果不同的话,图像翻转之后数值不变,相同的话从0-1或1-0即可

        for(int i=0;i<A.length;i++){

            int start = 0;              //左指针从前往后
            int end = A[i].length-1;    //右指针从后往前

            while(start < end){
                if(A[i][start] != A[i][end]){
                    start++;
                    end--;
                }else {
                    A[i][start] = A[i][start] == 0 ? 1 : 0;
                    A[i][end] = A[i][end] == 0 ? 1 : 0;
                }
            }

            if(start == end){
                A[i][start] = A[i][start] == 0 ? 1 : 0;
            }
        }

        return A;
    }
}


















