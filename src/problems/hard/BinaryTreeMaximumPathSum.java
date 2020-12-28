package problems.hard;


public class BinaryTreeMaximumPathSum {
    //存在负数的时候，初始ans 不能设为0
    int ans = Integer.MIN_VALUE;

    public static void main(String[] args) {

    }

    public int maxPathSum(TreeNode root) {
        oneSideMax(root);
        return ans;
    }

    public int oneSideMax(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = Math.max(0, oneSideMax(root.left));
        int right = Math.max(0, oneSideMax(root.right));

        ans = Math.max(ans, left + right + root.val);
        return Math.max(left, right) + root.val;
    }

}
