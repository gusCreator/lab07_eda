package trie;
class Node {
    Node[] children;
    boolean isEndOfWord;

    public Node() {
        children = new Node[52];
        isEndOfWord = false;
    }
}