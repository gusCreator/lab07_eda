package Test;
import trie.*;

public class test {
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
