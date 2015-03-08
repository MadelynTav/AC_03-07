
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


    }
}