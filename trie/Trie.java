package trie;

import java.util.HashMap;

public class Trie {

  private Node root;
  private int size;

  public Trie() {
    root = new Node();
  }

  public void insert(String key) {
    Node current = root;
    for (char c : key.toCharArray()) {
      current = current.children.computeIfAbsent(c, cha -> new Node());
    }
    if(current.repetitions == 0){
      size++;
    }
    current.repetitions++;
    current.isEndOfWord = true;
  }

  public boolean search(String word) {
    Node node = this.searchNode(word);
    if(node == null) return false;
    return node.isEndOfWord;
  }

  public int getRepetitions(String key) {
    Node node = this.searchNode(key);
    if(node == null) return 0;
    return node.repetitions;
  }
  
  public boolean replace(String key, String newKey) {
    Node node = searchNode(key);

    if (node == null || !node.isEndOfWord) {
        return false; 
    }

    Node existingNode = searchNode(newKey);
    if (existingNode != null && existingNode.isEndOfWord) {
        return false; 
    }

    node.isEndOfWord = false;
    node.repetitions--;
    insert(newKey);
    return true;
  }


  private Node searchNode(String key) {
    Node current = root;
    for (int i = 0; i < key.length(); i++) {
      char ch = key.charAt(i);
      Node node = current.children.get(ch);
      if (node == null) {
        return null;
      }
      current = node;
    }
    return current;
  }

  public int size() {
    return size;
  }

  private static class Node {
    HashMap<Character, Node> children;
    boolean isEndOfWord;
    int repetitions;

    public Node() {
      this.children = new HashMap<Character, Node>();
      this.isEndOfWord = false;
      this.repetitions = 0;
    }
  }
}
