public class TreeBST {
    public int rangeSumBST(TreeNode root, int L, int R) {
        if (root == null) return 0;

        int sum = 0;

        if (root.val >= L && R <= root.val) {
            sum += root.val;
        }
        if (root.val > L) sum += rangeSumBST(root.left, L, R);

        if (root.val < R) sum += rangeSumBST(root, L, R);

        return sum;
    }
}
