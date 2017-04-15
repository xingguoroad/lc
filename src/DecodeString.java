import java.util.Stack;

/**
 * Created by GelinZHU on 4/14/17.
 */
public class DecodeString {
    public String decodeString(String s) {
        String res = "", t = "";
        StringBuffer sb = new StringBuffer();
        Stack<Integer> s_num = new Stack<Integer>();
        Stack<String> s_str = new Stack<>();
        int cnt = 0;
        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                cnt = 10 * cnt + s.charAt(i) - '0';
            } else if (s.charAt(i) == '[') {
                s_num.push(cnt);
                s_str.push(t);
                cnt = 0;
                t = "";
            } else if (s.charAt(i) == ']') {
                int k = s_num.peek();
                s_num.pop();
                String l = s_str.peek();
                for (int j = 0; j < k; ++j) {
                    l += t;
                }
                t = l;
                s_str.pop();
            } else {
                t += s.charAt(i);
            }
        }

        return t;
    }

    public static void main(String[] args) {
        String s = "ef3[a2[c]]";
        DecodeString ds = new DecodeString();
        System.out.println(ds.decodeString(s));
    }
}
