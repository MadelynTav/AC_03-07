package nyc.c4q.madelyntav;

/**
 * Created by c4q-madelyntavarez and Allison Bojarski (Alizinha) on 3/8/15.
 */
import java.util.Scanner;
public class Month {
    public static void main(String[] args){
        String month;
        String holiday;
        int date;

        Scanner scanner=new Scanner(System.in);
        System.out.println("What is the month?");
        month=scanner.next();
        System.out.println("What is the day of the month?");
        date=scanner.nextInt();

        if (month.equalsIgnoreCase("January") && date==01)
            holiday= "New Year's Day";
        else if (month.equalsIgnoreCase("May") && date==05)
            holiday= "Cinco de Mayo";

        else if (month.equalsIgnoreCase("July")&& date==04)
            holiday= "Fourth of July";
        else if (month.equalsIgnoreCase("December")) {
            if (date == 25)
                holiday = "Christmas";
            if (date == 31)
                holiday = "New Year's Eve";
            else
                holiday = "The Holiday Season";
        }
        else
            holiday= "Not a holiday";
        System.out.println("It is " +holiday +"!");




    }
}
