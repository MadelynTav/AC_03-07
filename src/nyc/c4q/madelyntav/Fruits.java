package nyc.c4q.madelyntav;
import java.util.Scanner;

/**
 * Created by c4q-madelyntavarez on 3/8/15.
 */
public class Fruits {
    public static void main(String[] args){
        Scanner look= new Scanner(System.in);
        System.out.print("What is your favorite fruit?");
        String fruit = look.next();
        String color;
        String flavor;
        if (fruit.equals("banana")) {
            color = "yellow";
            flavor = "sweet";
        }
        else if (fruit.equals("grapefruit")) {
            color = "pink";
            flavor = "bitter";
        }
        else if (fruit.equals("lemon")) {
            color = "yellow";
            flavor = "sour";
        }
        else if (fruit.equals("Mango")){
            color="Orangy-yellow";
            flavor="Sweet and Sour";
        }
        else {
            color="Not a valid color";
            flavor="Unknown";
            System.out.println("I don't know that fruit.");
        }
        System.out.println("a " + fruit + " is " + color + " and tastes " + flavor);

    }
}
