package boluo;

/**
 * 翻转二叉树
 *      4
 *    /   \
 *   2     7
 *  / \   / \
 * 1   3 6   9
 *
 *      4
 *    /   \
 *   7     2
 *  / \   / \
 * 9   6 3   1
 *
 */
public class LeetCode0226_invertTree {
    public static void main(String[] args) {

    }

    public static TreeNode invertTree(TreeNode root) {
        if(root == null){
            return null;
        }else {
            exchange(root);
            invertTree(root.left);
            invertTree(root.right);
        }

        return root;
    }

    public static TreeNode exchange(TreeNode root){
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        return root;
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


