package pl.markopolo;

public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {

        if (root == null) return true;

        return isSymmetricHelper(root.left, root.right);

    }

    public boolean isSymmetricHelper(TreeNode left, TreeNode right) {

        if (left == null || right == null) return left == right;
        if (left.val != right.val) return false;

        return isSymmetricHelper(left.left, right.right) && isSymmetricHelper(left.right, right.left);
    }
}
