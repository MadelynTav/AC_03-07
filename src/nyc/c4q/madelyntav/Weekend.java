package nyc.c4q.madelyntav;

/**
 * Created by c4q-madelyntavarez and Allison Bojarski (Alizinha) on 3/8/15.
 */
import java.util.Scanner;

public class Weekend {
    public static void main(String[] args){
         String day;
         String week;

        Scanner scanner= new Scanner(System.in) ;
            System.out.println("What day of the week is it?");
            day=scanner.next();
            if(day.equalsIgnoreCase(("Saturday")) || day.equalsIgnoreCase(("Sunday")))
                week = "Weekend!";

            else if (day.equalsIgnoreCase("Monday")
                    || day.equalsIgnoreCase("Tuesday")
                    || day.equalsIgnoreCase("Wednesday")
                    || day.equalsIgnoreCase("Thursday")
                    || day.equalsIgnoreCase("Friday"))
            week="weekday!";
        else
            week= "day in another Universe but not this one!";
        System.err.println("It is a " + week);


        }
    }

