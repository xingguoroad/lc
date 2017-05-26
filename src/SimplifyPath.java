import java.util.LinkedList;

/**
 * Created by GelinZHU on 5/7/17.
 */
public class SimplifyPath {
    public static void main(String[] args) {
        SimplifyPath sp = new SimplifyPath();
        System.out.println(sp.simplifyPath("/a/b/c"));
    }

    public String simplifyPath(String path) {
        if (path.length() == 0) {
            return path;
        }

        String[] splits = path.split("/");
        LinkedList<String> stack = new LinkedList<String>();
        for (String s : splits) {
            if (s.length() == 0 || s.equals(".")) {
                continue;
            } else if (s.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.push(s);
            }
        }

        if (stack.isEmpty()) {
            stack.push("");
        }
        String ret = "";
        while (!stack.isEmpty()) {
            ret += "/" + stack.removeLast();
        }

        return ret;
    }
}
