
import java.util.HashMap;
import java.util.Random;

import heap.HeapMax;
import trie.Trie;

public class Main {

  public static void main(String[] args) {

    Trie trie = new Trie();

    trie.insert("apple");
    trie.insert("app");
    trie.insert("application");
    trie.insert("banana");
    trie.insert("band");
    trie.insert("bandana");
    trie.insert("peach");
    trie.insert("plum");
    trie.insert("pear");

    String[] words = { "apple", "banana", "application", "band", "bandana", "app", "peach", "plum", "pear" };

    for(String s : words){
      trie.insert(s);
    }

    String[] toProv = new String[100];
    Random random = new Random();
    for (int i = 0; i < toProv.length; i++) {
      String word = words[random.nextInt(words.length)];
      toProv[i] = word;
    }

    String[] arr = getKMostRepeatedWords(5, trie, toProv);
    //for(String s : arr){
    //  System.out.println(s);
    //}
  }

  public static String[] getKMostRepeatedWords(int k, Trie trie, String... words) {
    HashMap<String, Integer> map = new HashMap<>();
    HeapMax<Entry<String, Integer>> h = new HeapMax<>(trie.size());
    for (String w : words) {
      if (trie.search(w)) {
        if (!map.containsKey(w))
          map.put(w, 1);
        map.put(w, map.get(w) + 1);
      }
    }
    for (String w : map.keySet()) {
      h.insert(new Entry<String, Integer>(w, map.get(w)));
    }

    String[] res = new String[k];
    for (int i = 0; i < k; i++) {
      Entry<String, Integer> e = h.extract(); 
      res[i] = e.key;
      System.out.println(e.key + " -> " + e.val);
    }
    return res;

  }

  private static class Entry<K, V extends Comparable<V>> implements Comparable<Entry<K, V>> {
    K key;
    V val;

    public Entry(K k, V v) {
      this.key = k;
      this.val = v;
    }

    public int compareTo(Entry<K, V> x) {
      return this.val.compareTo(x.val);
    }

    public String toString() {
      return this.key.toString();
    }
  }

}
