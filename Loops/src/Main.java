// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter a number");
        int n = myScanner.nextInt();

//        for(int i = 0; i < int1; i++) {
//            System.out.println(i);
//        }

//        for(int i = 0; (i<int1); i++) {
//            if (i%2 == 0) {
//                System.out.println(i);
//            }
//        }

        for(int i = 0; i < n; i++) {
            if (i%3 == 0 && i%5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i%5 == 0) {
                System.out.println("Buzz");
            } else if (i%3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }
        }


    }
}