package nyc.c4q.madelyntav;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("What's your score?");
        int score= scanner.nextInt();

        System.out.println(score ==100);
        System.out.println(score>=90);
        System.out.println(score>=75);
        System.out.println(score>=60);

        if (score==100)
            System.out.println("Perfect Score!");
        else if (score >=90)
            System.out.println("Great!");
        else if (score>=75)
            System.out.println("You did okay!");
        else if (score>=60)
            System.out.println("You passed!");
        else
            System.out.println("You Failed :(");

        System.out.println("we're done!");

    }
}
