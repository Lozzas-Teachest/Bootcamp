// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
//        String firstName;
//        String lastName;
//        firstName = "Laura";
//        lastName = "Stanhope";
//        String name = firstName + " " + lastName;
//        System.out.println((name));

//        int num1;
//        int num2;
//        num1 = 10;
//        num2 =55;
//        System.out.println(num1 + num2);
//        float result = (float) num2/num1;
//        System.out.println(result);
//        int num3 = 8;
//        System.out.println(num3++);
//        System.out.println(++num3);
//        System.out.println(num3);

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        // String input
        String name = myScanner.nextLine();
        System.out.println("Hello " + name);
        System.out.println("Enter a number: ");
        int number = myScanner.nextInt();
        System.out.println("Enter a number: ");
        int numberTwo = myScanner.nextInt();
        System.out.println(number + numberTwo);
    }
}