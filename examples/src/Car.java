public class Car {
    //instance variables or attributes
    private String model;
    private String colour;
    private int speed;

    //variable belongs to the class - called on the class do not need an instance
    private static double carTax;

    public static double getCarTax() {
        carTax = 50;
        return carTax;
    }

    //constructor initialise instance variables
    //the constructor below is overloaded - same name but different number or type of parameter

    //right click - generate - constructor
    public Car(String model) {
        this.model = model;
    }

    public Car(String model, String colour, int speed) {
        this.model = model;
        this.colour = colour;
        this.speed = speed;
    }
    //Constructor empty
    public Car() {
    }

    public String getModel() {
        return model;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void accelerate(int newSpeed) {
        this.speed += newSpeed;
    }

    public int showSpeed() {
        return speed;
    }

    public Car compareTwoCars(Car aCar) {
        if(this.speed < aCar.speed) {
            return this;
        } else {
            return aCar;
        }
    }


}
