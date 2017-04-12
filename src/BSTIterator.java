import java.util.NoSuchElementException;
import java.util.Stack;

/**
 * Created by GelinZHU on 4/8/17.
 */
public class BSTIterator {
    private Stack<TreeNode> stack;
    public BSTIterator(TreeNode root) {
        stack = new Stack<TreeNode>();

        while (root != null) {
            stack.push(root);
            root = root.left;
        }

    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return !stack.empty();

    }

    /** @return the next smallest number */
    public int next() {
        TreeNode node = stack.pop();
        int result = node.val;
        if (node.right != null) {
            node = node.right;
            while (node != null) {
                stack.push(node);
                node = node.left;
            }
        }

        return result;
    }
}
