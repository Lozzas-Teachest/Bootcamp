

/*
 *
 * MyRectangle
 *
 */

public class MyRectangle extends MyShape implements Area
{

    //
    // ToDo:
    //
    // Add a constructor which takes 2 arguments: width and height
    //
    // You will need to pass these on to the constructor of the superclass
    // Remember how to call a superclass constructor?

    public MyRectangle(int width, int height) {
        super(width, height);
    }



    public String toString() {
        return "this is a rectangle" + " the size is: " + this.calculateArea();
    }

    @Override
    public double calculateArea() {
        return this.width*this.height;
    }


    //
    // ToDo:
    //
    // Implement the calculateArea() method defined in the superclass.
    //




}
