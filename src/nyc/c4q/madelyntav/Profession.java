package nyc.c4q.madelyntav;

/**
 * Created by c4q-Allison and Madelyn on 3/8/15.
 */
import java.util.Scanner;

public class Profession {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Do you carry a sword?");
        String response = scanner.next();
        boolean sword =
                response.equalsIgnoreCase("yes") || response.equalsIgnoreCase("y");


        System.out.print("Do you carry a helmet?");
        response = scanner.next();
        boolean helmet =
                response.equalsIgnoreCase("yes") || response.equalsIgnoreCase("y");

        System.out.print("Do you carry a sword?");
        response = scanner.next();
        boolean shovel =
                response.equalsIgnoreCase("yes") || response.equalsIgnoreCase("y");

        String profession;
        if (sword && helmet && !shovel)
            profession = "samurai";
        else if (sword && !helmet && !sword)
            profession = "Ninja";
        else if (!sword && helmet && sword)
            profession = "Construction worker";
        else if (!sword && !helmet && sword)
            profession = "Gardener";
        else if (sword && !helmet && !sword)
            profession = "Ninja";
        else if (!sword && helmet && !sword)
            profession = "Astronaut";
        else if (!sword && !helmet && !sword)
            profession = "Coder";

        else
            profession="person who is unemployed";

        System.out.println("You are a "+ profession);



    }
}
