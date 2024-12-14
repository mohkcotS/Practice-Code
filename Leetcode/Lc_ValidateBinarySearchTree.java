class Lc_ValidateBinarySearchTree {
    public boolean isValidBST(TreeNode root) {

        return check(root,Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean check(TreeNode node,long min,long max){
        if (node == null) {
            return true;
        }
        if (node.val <= min || node.val >= max) {
            return false;
        }
        return check(node.left, min, node.val) && check(node.right, node.val, max);

    }
}
