/**
 * Created by GelinZHU on 12/26/17.
 */
public class Trie {
    private TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    public void insert(String word) {
        TrieNode node = root;
        for (char c : word.toCharArray()) {
            if (node.childen[c - 'a'] == null) {
                node.childen[c - 'a'] = new TrieNode();
            }
            node = node.childen[c - 'a'];
        }
        node.item = word;
    }

    public boolean startWith(String word) {
        TrieNode node = root;
        for (char c : word.toCharArray()) {
            if (node.childen[c - 'a'] == null) {
                return false;
            }
            node = node.childen[c - 'a'];
        }
        return true;
    }

    public boolean search(String word) {
        TrieNode node = root;
        for (char c : word.toCharArray()) {
            if (node.childen[c - 'a'] == null) {
                return false;
            }
            node = node.childen[c - 'a'];
        }

        return node.item.equals(word);
    }
}
