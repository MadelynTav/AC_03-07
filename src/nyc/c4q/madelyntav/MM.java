package nyc.c4q.madelyntav;

/**
 * Created by c4q-Allison and Madelyn on 3/8/15.
 */
import java.util.Scanner;

public class MM {
    public static void main(String[] args){
        Scanner scanner= new Scanner (System.in);

        int count= 100; //Running total of number of M&M's
        while (count>0) {
            System.out.println("you have " + count + " MMs left");

            System.out.println("Eat how many?");
            int eat = scanner.nextInt();
            while (eat > count) {
                System.out.println("You cannot eat more than you have! Try again");
                eat = scanner.nextInt();
            }

            count = count - eat;
        }


            System.out.print("All the M&M's are gone");


        }
    }

