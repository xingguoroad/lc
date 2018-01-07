import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by GelinZHU on 12/26/17.
 */
public class WordSearchII {
    Set<String> result = new HashSet<>();

    public List<String> findWords(char[][] board, String[] words) {
        Trie root = new Trie();
        for (String word : words) {
            root.insert(word);
        }

        int m = board.length;
        int n = board[0].length;

        boolean[][] visited = new boolean[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                dfs(board, visited, "", i, j, root);
            }
        }
        return new ArrayList<String>(result);
    }

    public void dfs(char[][] board, boolean[][] visited, String str, int i, int j, Trie trie) {
        int m = board.length;
        int n = board[0].length;

        if (i < 0 || i >= m || j < 0 || j >= n) {
            return;
        }

        if (visited[i][j]) {
            return;
        }

        str += board[i][j];
        if (!trie.startWith(str)) {
            return;
        }

        if (trie.search(str)) {
            result.add(str);
        }

        visited[i][j] = true;
        dfs(board, visited, str, i - 1, j, trie);
        dfs(board, visited, str, i , j - 1, trie);
        dfs(board, visited, str, i + 1, j, trie);
        dfs(board, visited, str, i , j + 1, trie);
        visited[i][j] = false;
    }
}
