import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by GelinZHU on 3/23/17.
 */
public class LetterCombinationOfDigits {
    public List<String> letterCombinations(String digits) {
        String[] table = new String[] {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

        List<String> result = new ArrayList<>();
        if (digits == null || digits.length() == 0)  {
            return result;
        }

        List<Character> temp = new ArrayList<>();
        helper(digits, table, result, temp);

        return result;


    }

    public void helper(String digits, String[] table, List<String> result, List<Character> temp) {
        if (digits.length() == 0) {
            char[] arr = new char[temp.size()];
            for (int i = 0; i < temp.size(); i++) {
                arr[i] = temp.get(i);
            }
            result.add(String.valueOf(arr));
            return;

        }

        Integer curr = Integer.valueOf(digits.substring(0, 1));
        String cs = table[curr];
        for (int i = 0; i < cs.length(); i++) {
            temp.add(cs.charAt(i));
            helper(digits.substring(1), table, result, temp);
            temp.remove(temp.size() - 1);    // remove last one which is added just now
        }


    }
    public static void main(String[] args) {
        LetterCombinationOfDigits lcd = new LetterCombinationOfDigits();
        System.out.println(lcd.letterCombinations("23"));
    }
}
