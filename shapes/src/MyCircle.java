

/*
 *
 * MyCircle
 *
 */

public class MyCircle extends MyShape implements Area
{

    //
    // ToDo:
    //
    // Add a constructor which takes ONLY 1 argument1: radius
    // THATS 1 ARGUMENTS NOT 2 !
    // You can pass it into the superclass constructor twice

    public MyCircle(int radius) {
        super(radius, radius);
    }

    public String toString() {
        return "this is a circle" + " The size is " + this.calculateArea();
    }


    //
    // ToDo:
    //
    // Implement the calculateArea() method defined in the superclass.
    //
    //

    @Override
    public double calculateArea() {
        return Math.PI*(this.width*this.width);
    }
}
