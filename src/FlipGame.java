import java.util.ArrayList;
import java.util.List;

/**
 * Created by GelinZHU on 4/17/17.
 */
public class FlipGame {
    public List<String> generatePossibleNextMoves(String s) {
        List<String> list = new ArrayList<>();
        if (s.length() == 0 || s == null) {
            return list;
        }

        int from = 0;
        int index = 0;
        while((index = s.indexOf("++", from)) != -1) {
            String cs = s.substring(0, index) + "--" + s.substring(index + 2);
            list.add(cs);
            from = index + 1;
        }
        return list;
    }

    public static void main(String[] args) {
        FlipGame fg = new FlipGame();
        System.out.println(fg.generatePossibleNextMoves("++++"));
    }
}
