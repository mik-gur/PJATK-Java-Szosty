package second;

import java.util.HashSet;

public class Second {
    public static void main(String[] args) {
        HashSet<String> gameSet = new HashSet<>();

        gameSet.add("The Witcher 3: Wild Hunt");
        gameSet.add("Red Dead Redemption 2");
        gameSet.add("Mass Effect Trilogy");
        gameSet.add("The Legend of Zelda: Breath of the Wild");
        gameSet.add("God of War");

        System.out.println("HashSet: " + gameSet);

        String[] gameArray = gameSet.toArray(new String[0]);

        System.out.println("Table:");
        for (String game : gameArray) {
            System.out.println(game);
        }
        System.out.println("");
    }
}
