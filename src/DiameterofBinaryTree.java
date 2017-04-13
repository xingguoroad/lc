/**
 * Created by GelinZHU on 4/13/17.
 */
public class DiameterofBinaryTree {
    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = diameterOfBinaryTree(root.left);
        int right = diameterOfBinaryTree(root.right);

        int len = getHeight(root.left) + getHeight(root.right) + 1;
        return Math.max(len - 1, Math.max(left, right));
    }

    public int getHeight(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = getHeight(root.left);
        int right = getHeight(root.right);
        return Math.max(left, right) + 1;
    }
}
