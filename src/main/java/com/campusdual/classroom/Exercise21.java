package com.campusdual.classroom;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Exercise21 {


    public static Set<String> createHashSet() {
        Set<String> hashSet = new HashSet<>();

        addElementToSet(hashSet, "ELEMENT KPRBC");
        addElementToSet(hashSet, "ELEMENT YPBTM");
        addElementToSet(hashSet, "ELEMENT AADXU");
        addElementToSet(hashSet, "ELEMENT RXCGJ");
        addElementToSet(hashSet, "ELEMENT WYMVD");
        addElementToSet(hashSet, "ELEMENT WFGEJ");
        addElementToSet(hashSet, "ELEMENT TYGBS");
        addElementToSet(hashSet, "ELEMENT MAPTK");
        addElementToSet(hashSet, "ELEMENT GJXVE");
        addElementToSet(hashSet, "ELEMENT BAFGL");
        return hashSet;
    }


    public static Set<String> createTreeSet() {
        Set<String> treeSet = new TreeSet<>();

        addElementToSet(treeSet, "ELEMENT KPRBC");
        addElementToSet(treeSet, "ELEMENT YPBTM");
        addElementToSet(treeSet, "ELEMENT AADXU");
        addElementToSet(treeSet, "ELEMENT RXCGJ");
        addElementToSet(treeSet, "ELEMENT WYMVD");
        addElementToSet(treeSet, "ELEMENT WFGEJ");
        addElementToSet(treeSet, "ELEMENT TYGBS");
        addElementToSet(treeSet, "ELEMENT MAPTK");
        addElementToSet(treeSet, "ELEMENT GJXVE");
        addElementToSet(treeSet, "ELEMENT BAFGL");
        return treeSet;
    }

    public static boolean addElementToSet(Set<String> set, String element) {
        return set.add(element);
    }

    public static void printSet(Set<String> set) {
        for (String element : set) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        // Crear HashSet
        Set<String> hashSet = createHashSet();
        System.out.println("HashSet elements:");
        printSet(hashSet);

        // Crear TreeSet
        Set<String> treeSet = createTreeSet();
        System.out.println("TreeSet elements:");
        printSet(treeSet);
    }
}
