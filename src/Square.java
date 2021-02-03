public class Square extends Shape{
    private double length, height;
    public Square(String name) {
        super(name);
    }

    public void setDimensions(double l, double h){
        this.length=l;
        this.height=h;
    }

    @Override
    public void printDimensions(){
        System.out.println("    length: "+length);
        System.out.println("    Height: "+height);
    }

    @Override
    public double getArea() {
        return (height*length);
    }
}
