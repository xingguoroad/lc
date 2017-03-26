import java.util.*;

import static com.sun.tools.doclint.Entity.and;

/**
 * Created by GelinZHU on 3/24/17.
 */
public class ValidParentheses {
    public boolean isValid(String s) {
        if (s == null || s.length() == 0) {
            return false;
        }

        Map<Character, Character> pair = new HashMap<Character, Character>();
        pair.put('(', ')');
        pair.put('{', '}');
        pair.put('[', ']');


        Deque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < s.length(); i++) {
            if (pair.keySet().contains(s.charAt(i))) {
                stack.push(s.charAt(i));
            } else {
                if (stack.size() == 0) {
                    return false;
                }
                char c = stack.peek();
                if (pair.get(c) == s.charAt(i)) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }

        if (stack.size() == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        ValidParentheses vp = new ValidParentheses();
        System.out.println(vp.isValid("()"));
    }
}
