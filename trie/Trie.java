package trie;

public class Trie {
    private Node root;

    public Trie() {
        root = new Node();
    }





















    public boolean search(String word) {
        Node current = root;
        for (char ch : word.toCharArray()) {
            int index = ch - 'a';
            if (current.children[index] == null) {
                return false;
            }
            current = current.children[index];
        }
        return current.isEndOfWord;
    }
}
