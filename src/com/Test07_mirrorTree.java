package com;

/**
 * 给一个二叉树,输出它的镜像二叉树
 */
public class Test07_mirrorTree {
    public static void main(String[] args) {

    }

    public TreeNode mirrorTree(TreeNode root){
        if(root == null){
            return null;
        }else {
            TreeNode temp = root.left;

            root.left = mirrorTree(root.right);
            root.right = mirrorTree(temp);
            return root;
        }

    }
}
