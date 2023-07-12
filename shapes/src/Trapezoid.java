public class Trapezoid extends MyShape implements Area {

    private double base;

    public Trapezoid(int width, int height, double base) {
        super(width, height);
        this.base = base;
    }

    public String toString() {
        return "this is a trapezoid" + " The size is" + this.calculateArea();
    }


    @Override
    public double calculateArea() {
        int divdeBy = 2;
        return (this.width+this.base)/divdeBy * this.height;
    }
}
