package com;

/**
 * 给定二叉搜索树的根结点 root，返回 L 和 R（含）之间的所有结点的值的和。
 *
 * 二叉搜索树保证具有唯一的值。
 */
public class LeetCode938_rangeSumBST {

    int result;

    public static void main(String[] args) {

    }

    public int rangeSumBST(TreeNode root, int L, int R){
        if(root != null){
            if(L < root.val && root.val < R){
                result += root.val;
            }else if(L < root.val){
                rangeSumBST(root.left,L,R);
            }else {
                rangeSumBST(root.right,L,R);
            }
        }

        return result;
    }

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}








