package third;

import java.util.TreeSet;

public class Third {
    public static void main(String[] args) {

        TreeSet<String> tree1 = new TreeSet<>();
        tree1.add("Black");
        tree1.add("Green");
        tree1.add("Orange");
        tree1.add("Red");
        tree1.add("White");
        System.out.println("Posortowane drzewo binarne: ");
        System.out.println("a) Drzewo zawierające pięć nazw kolorów:\ntree1:" + tree1);

        System.out.println("");


        System.out.println("b) Iterowanie po wszystkich elementach drzewa:");
        for (String color : tree1) {
            System.out.println(color);
        }

        System.out.println("");


        System.out.println("c) Dodanie do istniejącego drzewa nowego drzewa binarnego:");
        TreeSet<String> tree2 = new TreeSet<>();
        tree2.add("Black");
        tree2.add("Pink");
        tree2.add("White");
        System.out.println("tree1: " + tree1);
        System.out.println("tree2: " + tree2);
        tree1.addAll(tree2);
        System.out.println("treee1 po zsumowaniu z tree2: " + tree1);

        System.out.println("");


        System.out.println("d) Wypisanie elementów drzewa w odwrotnej kolejności:");
        System.out.println("Oryginalne drzewo tree1: " + tree1);
        System.out.println("Odwrotna kolejność:");
        for (String color : tree1.descendingSet()) {
            System.out.println(color);
        }

        System.out.println("");


        System.out.println("e) Wypisanie pierwszego i ostatniego elementu przechowywanego w drzewie:");
        System.out.println("tree1: " + tree1);
        System.out.println("Pierwszy element drzewa: " + tree1.first());
        System.out.println("Ostatni element drzewa: " + tree1.last());

        System.out.println("");


        System.out.println("f) Sklonowanie drzewa binarnego do innego drzewa binarnego i wypisanie nowego drzewa na ekran:");
        System.out.println("tree1: " + tree1);
        TreeSet<String> tree3 = new TreeSet<>(tree1);
        System.out.println("Nowe drzewo tree3: " + tree3);

        System.out.println("");


        System.out.println("g) Liczba elementów, przechowywanych w drzewie:");
        System.out.println("tree1: " + tree1);
        System.out.println("Rozmiar tree1: " + tree1.size());

        System.out.println("");


        System.out.println("h) Porównanie elementów przechowywanych w dwóch drzewach binarnych");
        compareElements(tree1, tree2, "Black");
        compareElements(tree1, tree2, "Green");
        compareElements(tree1, tree2, "Orange");
        compareElements(tree1, tree2, "Pink");
        compareElements(tree1, tree2, "Red");
        compareElements(tree1, tree2, "White");
    }

    private static void compareElements(TreeSet<String> tree1, TreeSet<String> tree2, String element) {
        System.out.println("- Czy element <<" + element + ">> w drzewie tree1 jest taki sam jak w tree2?");
        if (tree1.contains(element) && tree2.contains(element)) {
            System.out.println("Tak");
        } else {
            System.out.println("Nie");
        }
        System.out.println("");
    }
}
