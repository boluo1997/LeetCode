package com;

//返回二叉树深度

public class Offer55_maxDepth {
    public static void main(String[] args) {

    }

    public int maxDepth(TreeNode root){

        if(root == null){
            return 0;
        }else {
            int nl = this.maxDepth(root.left);
            int nr = this.maxDepth(root.right);
            return nl > nr ? nl+1 : nr+1;
        }
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


