package com.campusdual.classroom;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Exercise21 {

    // Método que crea y devuelve un HashSet
    public static Set<String> createHashSet() {
        Set<String> hashSet = new HashSet<>();
        String[] elements = {
                "ELEMENT KPRBC",
                "ELEMENT YPBTM",
                "ELEMENT AADXU",
                "ELEMENT RXCGJ",
                "ELEMENT WYMVD",
                "ELEMENT WFGEJ",
                "ELEMENT TYGBS",
                "ELEMENT MAPTK",
                "ELEMENT GJXVE",
                "ELEMENT BAFGL"
        };

        // Añadir elementos al HashSet
        for (String element : elements) {
            hashSet.add(element);
        }

        return hashSet;
    }

    // Método que crea y devuelve un TreeSet
    public static Set<String> createTreeSet() {
        Set<String> treeSet = new TreeSet<>();
        String[] elements = {
                "ELEMENT KPRBC",
                "ELEMENT YPBTM",
                "ELEMENT AADXU",
                "ELEMENT RXCGJ",
                "ELEMENT WYMVD",
                "ELEMENT WFGEJ",
                "ELEMENT TYGBS",
                "ELEMENT MAPTK",
                "ELEMENT GJXVE",
                "ELEMENT BAFGL"
        };

        // Añadir elementos al TreeSet
        for (String element : elements) {
            treeSet.add(element);
        }

        return treeSet;
    }

    // Método para añadir un nuevo elemento a un conjunto
    public static boolean addElementToSet(Set<String> set, String element) {
        return set.add(element);
    }

    // Método que recorre y muestra los elementos de un conjunto
    public static void printSet(Set<String> set) {
        for (String element : set) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        // Crear HashSet y TreeSet
        Set<String> hashSet = createHashSet();
        Set<String> treeSet = createTreeSet();

        // Imprimir los conjuntos
        System.out.println("HashSet elements:");
        printSet(hashSet);

        System.out.println("TreeSet elements:");
        printSet(treeSet);
    }
}
