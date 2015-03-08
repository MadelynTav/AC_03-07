/**
 * Created by c4q-madelyntavarez on 3/8/15.
 */

import  java.util.Scanner;

public class Smiley {
    public static void main(String[] argv){
        Scanner scanner= new Scanner(System.in);
        System.out.print("How do you feel");
        String emoticon= scanner.next();

        String emotion;
        if (emoticon.equals(":)"))
            emotion= "happy";
        else if (emoticon.equals(":("))
            emotion="Sad";
        else if (emoticon.equals(":|"))
            emotion="Blah";
        else
            emotion="ARGH";

        System.out.println("You are feeling "+ emotion);
    }
}
