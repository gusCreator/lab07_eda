package trie;

import java.util.HashMap;

public class Trie {
    private Node root;

    public Trie() {
        root = new Node();
    }

    public void insert(String key) {

    }

    public boolean search(String word) {

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
