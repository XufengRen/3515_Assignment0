import static java.lang.Math.sqrt;

public class Triangle extends Shape{
    private double a,b,c;
    public Triangle(String name) {
        super(name);
    }

    public void setDimensions(double a, double b, double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }

    @Override
    public void printDimensions() {
        System.out.println("    a= "+a+", b= "+b+", c= "+c);
    }

    @Override
    public double getArea() {
        double s = (a+b+c)/2;
        return sqrt(s*(s-a)*(s-b)*(s-c));
    }
}
