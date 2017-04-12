/**
 * Created by GelinZHU on 4/12/17.
 */
public class SentenceScreenFitting {
    public int wordsTyping(String[] sentence, int rows, int cols) {
        if (sentence == null || sentence.length == 0) {
            return 0;
        }

        String s = String.join(" ", sentence) + " ";
        int length = s.length();
        int start = 0;
        for (int i = 0; i < rows; i++) {
            start += cols;
            if (s.charAt(start % length) == ' ') {   // this line is fit
                start++;
            } else {
                while (start > 0 && s.charAt(start % length) != ' ') {
                    start--;
                }
                start++;
            }
        }

        return start / length;
    }
}
