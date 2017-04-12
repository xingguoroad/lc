import java.util.Stack;

/**
 * Created by GelinZHU on 4/9/17.
 */
public class LongestAbsoluteFilePath {
    public int lengthLongestPath(String input) {
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        if (input == null || input.length() == 0) {
            return 0;
        }

        int maxLen = 0;

        for (String s : input.split("\n")) {
            int lev = s.lastIndexOf("\t") + 1;   // lev >= 0

            // Find out parent
            while (lev < stack.size() - 1) {
                stack.pop();
            }

            // Up to here, we are with the parent dir.
            int len = stack.peek() + s.length() - lev + 1;   // Notice 1 is the /
             stack.push(len);
            if (s.contains(".")) {
                maxLen = Math.max(maxLen, len - 1);   // len - 1 because we added / for this file.
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {
        LongestAbsoluteFilePath laf = new LongestAbsoluteFilePath();
        System.out.println(laf.lengthLongestPath("dir\n\tsubdir1\n\tsubdir2\n\t\tfile.ext"));
    }
}
