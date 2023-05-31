package first;

import java.util.LinkedList;

public class First {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("Red");
        linkedList.add("Green");
        linkedList.add("Black");
        linkedList.add("Pink");
        linkedList.add("Orange");

        System.out.println("The Original linked list: " + linkedList);

        String firstElement = linkedList.removeFirst();
        String lastElement = linkedList.removeLast();

        System.out.println("Element removed: " + firstElement);
        System.out.println("Element removed: " + lastElement);

        System.out.println("The New linked list: " + linkedList);
        System.out.println("");
    }
}
