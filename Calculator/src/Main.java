// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        String exitKey = "y";

        while(exitKey.equals("y") || exitKey.equals("Y")) {
            calculate(myScanner);
            System.out.println("Do you want to do some more maths? y or x");
            String response = myScanner.next();
            exitKey = response;
        }
    }

    private static void calculate(Scanner myScanner) {
        System.out.println("Enter a number");
        int int1 = myScanner.nextInt();
        System.out.println("Enter a number");
        int int2 = myScanner.nextInt();
        System.out.println("Enter an operator + - / *");
        String operator = myScanner.next();


        if (operator.equals("+")) {
            System.out.println(int1 + int2);

        } else if (operator.equals("-")) {
            System.out.println(int1 - int2);

        } else if (operator.equals("/")) {
            System.out.println(int1/int2);

        } else if (operator.equals("*")) {
            System.out.println(int1*int2);
        }
    }
}