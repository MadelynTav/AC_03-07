package nyc.c4q.madelyntav;

/**
 * Created by c4q-Allison and Madelyn on 3/8/15.
 */
import java.util.Random;
import java.util.Scanner;
public class RandomTool {
    public static void main(String[] args) {
        int userNumber;

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int number = new Random().nextInt(10) + 1;

        System.out.println("I have chosen a number between 1 and 10. Try to guess it.");
        userNumber = scanner.nextInt();

        while (number != userNumber) {
            if (number > userNumber)
                System.out.println("Too Low!");
            else if (number < userNumber)
                System.out.println("Too high!");
            System.out.println("guess");
            userNumber = scanner.nextInt();

        }
                if (number==userNumber)
                System.out.println("That's right!");

                }


            }



