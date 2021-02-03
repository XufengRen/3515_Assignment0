public class Circle extends Shape{
    private double radius;
    public Circle(String name) {
        super(name);
    }
    public void setDimensions(double r){
        this.radius=r;
    }

    @Override
    public void printDimensions() {
        System.out.println("    Radius: "+radius);
    }

    @Override
    public double getArea() {
        return 2*3.14*radius;
    }
}
