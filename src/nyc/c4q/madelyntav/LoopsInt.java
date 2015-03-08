package nyc.c4q.madelyntav;

/**
 * Created by c4q-Allison and Madelyn on 3/8/15.
 */
import java.util.Scanner;

public class LoopsInt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userAte;
        int currentMM=100;

//        System.out.println("You have 100 M&M's. How many do you want to eat?");


        while (currentMM > 0){
            System.out.print("You have "+ currentMM + " M&M's. How many would you like to eat?");
            userAte=scanner.nextInt();
            if (userAte > currentMM) {
                System.out.println("You cannot eat more than you have!");
            }
            else
                currentMM=(currentMM-userAte);


        }
        System.out.println("You ran out of M&M's!");



// First we start with 100
        //userEats=
        //remain=
        //

    }
}


