package com;

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
public class Test28_flipAndInvertImage {
    public static void main(String[] args) {

    }

    public static int[][] flipAndInvertImage(int[][] A){
        int[][] temp = new int[A.length][];

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
}


















