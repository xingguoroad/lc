/**
 * Created by GelinZHU on 4/19/17.
 */
public class ClosestBinarySearchTreeValue {
    double min = Double.MAX_VALUE;
    double answer;

    public int closestValue(TreeNode root, double target) {
        if (root == null) {
            return Integer.MAX_VALUE;
        }
        helper(root, target);
       return (int)answer;
    }

    public void helper(TreeNode root, double target) {
        if (root == null) {
            return;
        }
        if (Math.abs(root.val - target) < min) {
            min = Math.abs(root.val - target);
            answer = root.val;
        }

        if (root.val > target) {
            helper(root.left, target);
        } else {
            helper(root.right, target);
        }
    }
}
