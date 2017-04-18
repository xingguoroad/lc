/**
 * Created by GelinZHU on 4/17/17.
 */
public class FindtheDifference {
    public char findTheDifference(String s, String t) {
        int[] letters = new int[26];

        for (char c : s.toCharArray()) {
            letters[c - 'a']++;
        }

        for (char c : t.toCharArray()) {
            letters[c - 'a']--;
        }

        for (int i = 0; i < 26; i++) {
            if (letters[i] < 0) {
                return (char) (i + Character.valueOf('a'));
            }
        }
        return 0;
    }
}
