// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        String[] myCars = new String[3];
        myCars[0] = "car1";
        myCars[1] = "car2";
        myCars[2] = "car3";

        for(int i = 0; i<myCars.length ; i++) {
            System.out.println(myCars[i].toString());
        }

        //used if you know what will go in array
        String[] otherCars = {"ford", "bmw", "mercedes"};

        //enhanced for
        for(String car : otherCars) {
            System.out.println(car.toString());
        }


    }
}