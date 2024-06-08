import java.util.Random;
import java.util.Scanner;
public class DieRoller {
    public static void main(String[] args) {
        int roll1;
        int roll2;
        int roll3;
        int total;
        String response;
        boolean YorN = true;
        boolean allEquals = false;
        Random generator = new Random();
        Scanner in = new Scanner(System.in);
        do {
            while (!allEquals) {
                roll1 = generator.nextInt(6) + 1;
                roll2 = generator.nextInt(6) + 1;
                roll3 = generator.nextInt(6) + 1;
                System.out.printf("%-10s %-6s %10s %n", "Roll 1", "Roll 2", "Roll 3");
                System.out.printf("%-10s %-6s %5s", roll1, roll2, roll3);
                total = roll1 + roll2 + roll3;
                System.out.println();
                System.out.println("Your total is " + total);
                System.out.println();
                if (roll1 == roll2) {
                    if (roll2 == roll3) {
                        System.out.println("All are equal with a value of " + roll1);
                        allEquals = true;
                    }
                }
            }
            System.out.println("Would you like to roll until all 3 are equal again? Y/N");
            response = in.next();
            if (response.equals("Y")) {
                System.out.println("Program continuing.");
                allEquals = false;
            }
            else if (response.equals("N")){
                System.out.println("Program terminating.");
                YorN = false;
            }
        } while (YorN);
    }
}
