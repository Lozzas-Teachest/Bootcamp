

public class ShapeTest
{

    public static void main(String[] args) {
        // Create a polymorphic array of
        // four MyShape objects - some of which are
        // MyRectangles and others are MyCircles.
        Area[] myShapes = {
                new MyRectangle(200,200),
                new MyCircle(100),
                new MyRectangle(100,50),
                new MyCircle(50),
                new Trapezoid(10, 10, 10)
        };

        //
        // ToDo:
        //
        // Print calculated area of every shape in the above array

        for (Area shape: myShapes) { 
            System.out.println(shape.toString());
    }
}
}