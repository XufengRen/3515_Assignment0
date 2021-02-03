import static java.lang.Math.sqrt;

public class EquilateralTriangle extends Triangle{
    private double side;
    public EquilateralTriangle(String name) {
        super(name);
    }


    public void setDimensions(double a) {
        this.side=a;
    }

    @Override
    public void printDimensions() {
        System.out.println("    Side = "+side);
    }

    @Override
    public double getArea() {
        return (sqrt(3)/4)*(side*side);
    }
    //new comment
}
