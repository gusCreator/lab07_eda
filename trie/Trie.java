package trie;

public class Trie {
    private Node root;

    public Trie() {
        root = new Node();
    }


    public void insert(String key) {

      Node current = root;
      for(int i = 0; i <  key.length(); i++){
        int index = key.charAt(i) - 'a'; 
      }

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

    private static class Node {
      HashMap<Node> children;
      boolean isEndOfWord;
  
      public Node() {
          children = new Node[52];
          isEndOfWord = false;
      }
  }
}
