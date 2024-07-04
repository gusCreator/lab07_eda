package trie;

import java.util.HashMap;

public class Trie {
    private Node root;

    public Trie() {
        root = new Node();
    }

    public void insert(String key) {
      Node current = root;
      for(char c :  key.toCharArray()){
        current = current.children.computeIfAbsent(c, cha -> new Node());
      }
      current.isEndOfWord = true;
    }

    public boolean search(String word) {
        Node current = root;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            Node node = current.children.get(ch);
            if (node == null) {
                return false;
            }
            current = node;
        }
        return current.isEndOfWord;
    }

    public void delete(String key) {

    }

    private static class Node {
      HashMap<Character, Node> children;
      boolean isEndOfWord;
  
      public Node() {
          children = new HashMap<Character, Node>();
          isEndOfWord = false;
      }
  }
}
