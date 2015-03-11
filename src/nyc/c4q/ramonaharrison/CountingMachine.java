package nyc.c4q.ramonaharrison;

/**
 * Created by mona on 3/10/15.
 */
import java.util.Scanner;

public class CountingMachine {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Count from:");
        int countFrom = input.nextInt();

        System.out.println("Count to:");
        int countTo = input.nextInt();

        System.out.println("Count by:");
        int countBy = input.nextInt();

        for (int i = countFrom; i <= countTo; i = i + countBy) {
            System.out.print(i);
            System.out.print(" ");
        }
    }
}
