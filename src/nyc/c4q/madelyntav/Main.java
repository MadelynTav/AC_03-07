package nyc.c4q.madelyntav;
<<<<<<< HEAD

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
=======
//Madelyn Tavarez And Charlyn Buchanan(Charlyn23)
//Polish Calculator
//C4Q NYC
//Working with variables and math functions

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner input= new Scanner(System.in);
        int number;
        int numberTwo;

        char operator;

        System.out.println("Please enter Your First Number");
        number=input.nextInt();
        System.out.println("Please enter the second number");
        numberTwo=input.nextInt();
        System.out.println("Please enter an operator");
        operator= input.next().charAt(0);


        if (operator=='+'){
            System.out.println("Result is "+ number+numberTwo);
        }

        else if (operator=='-'){
            System.out.println("Result is "+(number-numberTwo));
        }
        else if (operator=='*'){
            System.out.println("Result is "+number*numberTwo);

        }
        else if (operator=='%'){
            System.out.println("Result is "+number%numberTwo);
        }
        else if (operator=='/'){
            System.out.println("Result is "+number/numberTwo);
        }
        else {
            System.out.println("Not A Valid Operator!");
        }




>>>>>>> c85827b8a0c6442a3aabbd53fbe3e8b7c228d584

    }
}
