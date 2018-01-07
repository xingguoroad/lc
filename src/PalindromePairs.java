import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by GelinZHU on 12/24/17.
 */
public class PalindromePairs {
    public List<List<Integer>> palindromePairs(String[] words) {
        // Put word in a map, key is word, value is index of word in String[].
        // Assuming there are no duplicate words in String[].
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            map.put(words[i], i);
        }

        List<List<Integer>> result = new ArrayList<List<Integer>>();

        for (int i = 0; i < words.length; i++) {
            // Handle when word is ""
            if (words[i].length() == 0) {
                for (Map.Entry<String, Integer> entry : map.entrySet()) {
                    if (isPalindrome(entry.getKey())) {
                        addOneList(result, i, entry.getValue());
                    }
                }
                continue;
            }

            for (int j = 0; j < words[i].length(); j++) {
                String fs = words[i].substring(0, j);
                String ss = words[i].substring(j, words[i].length());
                if (isPalindrome(fs) && map.containsKey(reverse(ss))) {
                    addOneList(result, map.get(reverse(ss)), i);
                }
                if (isPalindrome(ss) && map.containsKey(reverse(fs))) {
                    addOneList(result, i, map.get(reverse(fs)));
                }
            }
        }


        return result;
    }

    public String reverse(String word) {
        return new StringBuilder(word).reverse().toString();
    }

    public boolean isPalindrome(String word) {
        for (int i = 0, j = word.length() - 1; i < j; i++, j--) {
            if (word.charAt(i) != word.charAt(j)) {
                return false;
            }
        }
        return true;
    }

    // Create a list [a, b], then add into result
    public void addOneList(List<List<Integer>> result, int a, int b) {
        if (a == b) {
            return;
        }
        List<Integer> l = new ArrayList<>();
        l.add(a);
        l.add(b);
        result.add(l);
    }

    public static void  main(String args[]) {
        PalindromePairs pp = new PalindromePairs();
        String[] words = new String[] {"abcd","dcba","lls","s","sssll"};
        System.out.println(pp.palindromePairs(words).toString());
    }

}
