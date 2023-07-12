// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);  // Create a Scanner object
//        System.out.println("Enter a number");
//        int int1 = myScanner.nextInt();  // Read user input
//        System.out.println("Enter a number");
//        int int2 = myScanner.nextInt();  // Read user input
//
//        if (int1>int2) {
//            System.out.println(int1);
//        } else {
//            System.out.println(int2);
//        }
        System.out.println("Enter a number between 1 and 12");
        int int1 = myScanner.nextInt();

        switch (int1) {
            case 1:
                System.out.println("Winter");
                break;
            case 2:
                System.out.println("Winter");
                break;
            case 3:
                System.out.println("Spring");
                break;
            case 4:
                System.out.println("Spring");
                break;
            case 5:
                System.out.println("Spring");
                break;
            case 6:
                System.out.println("Summer");
                break;
            case 7:
                System.out.println("Summer");
                break;
            case 8:
                System.out.println("Summer");
                break;
            case 9:
                System.out.println("Autumn");
                break;
            case 10:
                System.out.println("Autumn");
                break;
            case 11:
                System.out.println("Winter");
                break;
            case 12:
                System.out.println("Winter");
                break;
            default:
                System.out.println("Your number is invalid");
                break;
        }
    }

}