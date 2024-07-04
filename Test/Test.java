package Test;

import trie.Trie;

public class Test {
    public static void main(String[] args) {
        Trie trie = new Trie();

        // Prueba de inserción y búsqueda
        System.out.println("Probando método insert y search:");
        trie.insert("hello");
        System.out.println("Buscar 'hello': " + (trie.search("hello") ? "Encontrado" : "No encontrado"));
        System.out.println("Buscar 'world': " + (trie.search("world") ? "Encontrado" : "No encontrado"));

        trie.insert("world");
        System.out.println("Buscar 'world': " + (trie.search("world") ? "Encontrado" : "No encontrado"));

        trie.insert("hello");
        System.out.println("Buscar 'hello' después de insertar de nuevo: " + (trie.search("hello") ? "Encontrado" : "No encontrado"));

        // Prueba de repeticiones
        System.out.println("\nProbando método getRepetitions:");
        System.out.println("Repeticiones de 'hello': " + trie.getRepetitions("hello")); // Debería ser 2
        System.out.println("Repeticiones de 'world': " + trie.getRepetitions("world")); // Debería ser 1
        System.out.println("Repeticiones de 'foo': " + trie.getRepetitions("foo")); // Debería ser 0
    }
    }
}
