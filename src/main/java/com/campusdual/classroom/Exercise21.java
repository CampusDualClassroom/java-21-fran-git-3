package com.campusdual.classroom;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Exercise21 {

    // Método que crea y devuelve un HashSet con elementos específicos
    public static Set<String> createHashSet() {
        Set<String> hashSet = new HashSet<>();
        // Añadiendo los elementos al HashSet
        hashSet.add("ELEMENT KPRBC");
        hashSet.add("ELEMENT YPBTM");
        hashSet.add("ELEMENT AADXU");
        hashSet.add("ELEMENT RXCGJ");
        hashSet.add("ELEMENT WYMVD");
        hashSet.add("ELEMENT WFGEJ");
        hashSet.add("ELEMENT TYGBS");
        hashSet.add("ELEMENT MAPTK");
        hashSet.add("ELEMENT GJXVE");
        hashSet.add("ELEMENT BAFGL");
        return hashSet;
    }

    // Método que crea y devuelve un TreeSet con elementos específicos
    public static Set<String> createTreeSet() {
        Set<String> treeSet = new TreeSet<>();
        // Añadiendo los elementos al TreeSet
        treeSet.add("ELEMENT KPRBC");
        treeSet.add("ELEMENT YPBTM");
        treeSet.add("ELEMENT AADXU");
        treeSet.add("ELEMENT RXCGJ");
        treeSet.add("ELEMENT WYMVD");
        treeSet.add("ELEMENT WFGEJ");
        treeSet.add("ELEMENT TYGBS");
        treeSet.add("ELEMENT MAPTK");
        treeSet.add("ELEMENT GJXVE");
        treeSet.add("ELEMENT BAFGL");
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
        // Crear HashSet
        System.out.println("hashSet");
        Set<String> hashSet = createHashSet();
        printSet(hashSet);

        // Crear TreeSet
        System.out.println("treeSet");
        Set<String> treeSet = createTreeSet();
        printSet(treeSet);
    }
}
