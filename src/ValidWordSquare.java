import java.util.ArrayList;
import java.util.List;

/**
 * Created by GelinZHU on 4/20/17.
 */
public class ValidWordSquare {
    public boolean validWordSquare(List<String> words) {
        if(words == null || words.size() == 0){
            return true;
        }
        int n = words.size();
        for(int i=0; i<n; i++){
            for(int j=0; j<words.get(i).length(); j++){
                if(j >= n || words.get(j).length() <= i || words.get(j).charAt(i) != words.get(i).charAt(j))
                    return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("ball");
        list.add("asee");
        list.add("let");
        list.add("lep");
        ValidWordSquare vs = new ValidWordSquare();
        System.out.println(vs.validWordSquare(list));
    }
}
