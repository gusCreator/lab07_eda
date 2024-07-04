package Test;
import trie.*;

import trie.Trie;

public class Test {
    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insert("Steven");
        trie.insert("Palabra");

        System.out.println(trie.search("Steven")); // true
        System.out.println(trie.search("Palabra")); // true
        System.out.println(trie.search("Steve"));  // false

        trie.delete("Palabra");
        System.out.println(trie.search("Palabra")); // false
    }
}
