/**
 * Created by GelinZHU on 12/29/17.
 */
public class ConvertSortedArraytoBinarySearchTree {

    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null || nums.length == 0) {
            return null;
        }

        if (nums.length == 1) {
            return new TreeNode(nums[0]);
        }

        return myBst(nums, 0, nums.length);
    }

    public TreeNode myBst(int[] nums, int start, int end) {
        if (start > end) {
            return null;
        }

        int mid = (start + end) / 2;
        TreeNode n = new TreeNode(nums[mid]);
        n.left = myBst(nums, start, mid - 1);
        n.right = myBst(nums, mid + 1, end);
        return n;
    }
}


