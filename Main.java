
import heap.HeapMax;
import trie.Trie;
public class Main {

  public static void main(String[] args) {
    
  }

  public static String[] getKMostRepeatedWords(int k, Trie trie, String... words) {
    HeapMax<Entry<String, Integer>> h = new HeapMax<>(trie.size());
    for(String w : words){
      int rep = trie.getRepetitions(w);
      h.insert(new Entry<>(w, rep)); 
    }

    String[] res = new String[k];
    for(int i = 0; i < k; i++){
      res[i] = h.extract().key;
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
