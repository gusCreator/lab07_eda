package Test;

import trie.Trie;

public class Test {
    public static void main(String[] args) {
        Trie trie = new Trie();

        // Prueba de inserción y búsqueda
        System.out.println("Probando método insert y search:");
        trie.insert("hello");
        System.out.println("Buscar 'hello': " + trie.search("hello"));
        System.out.println("Buscar 'world': " + trie.search("world"));
        trie.insert("world");
        System.out.println("Buscar 'world': " + trie.search("world"));
        trie.insert("hello");
        System.out.println("Buscar 'hello' después de insertar de nuevo: " + trie.search("hello"));

        //Prueba de replace
        System.out.println("\nSección Replace");
        trie.replace("hello","hellos");
        System.out.println("Buscar 'hello': " + trie.search("hello"));
        System.out.println("Buscar 'hell': " + trie.search("hell"));
        System.out.println("Buscar 'hellos': " + trie.search("hell"));

        // Prueba de repeticiones
        System.out.println("\nProbando método getRepetitions:");
        System.out.println("Repeticiones de 'hello': " + trie.getRepetitions("hello"));
        System.out.println("Repeticiones de 'world': " + trie.getRepetitions("world")); 
        System.out.println("Repeticiones de 'foo': " + trie.getRepetitions("foo")); 
    }
}
