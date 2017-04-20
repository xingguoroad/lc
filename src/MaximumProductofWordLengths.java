/**
 * Created by GelinZHU on 4/19/17.
 */
public class MaximumProductofWordLengths {
    public int maxProduct(String[] words) {
        if (words == null || words.length == 0) {
            return 0;
        }

        int[] encoded = new int[words.length];

        // Initialize encoded
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            for (int j = 0; j < word.length(); j++) {
                encoded[i] |= 1 << (word.charAt(j) - 'a');
            }
        }

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if ((encoded[i] & encoded[j]) == 0) {
                    int product = words[i].length() * words[j].length();
                    if (product > max) {
                        max = product;
                    }
                }
            }
        }
        return max;
    }
}
