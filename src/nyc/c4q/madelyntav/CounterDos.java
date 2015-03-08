package nyc.c4q.madelyntav;

/**
 * Created by c4q-Allison and Madelyn on 3/8/15.
 */
import java.util.Scanner;
public class CounterDos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i = 100;
        while (i > 10) {
            System.out.println(i);
            while (i>=1) {
                System.out.println(i);
                if (i > 10) {
                    i -= 5;
                }
                else
                i-=1;

        }

         }
        }

}