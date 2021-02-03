import java.util.Scanner;

public class main {

    public static void main(String args[]){

        Scanner s = new Scanner(System.in);

        Square square = new Square("block");
        Circle circle = new Circle("shield");
        Triangle triangle = new Triangle("spear");
        EquilateralTriangle equilateralTriangle = new EquilateralTriangle("tip");

        System.out.println("For square: ");
        System.out.println("    Enter length: ");
        double l = s.nextDouble();
        System.out.println("    Enter heigth: ");
        double h = s.nextDouble();
        square.setDimensions(l,h);

        System.out.println("For circle: ");
        System.out.println("    Enter radius: ");
        double r = s.nextDouble();
        circle.setDimensions(r);

        System.out.println("For triangle: ");
        System.out.println("    Enter side 1: ");
        double a = s.nextDouble();
        System.out.println("    Enter side 2: ");
        double b = s.nextDouble();
        System.out.println("    Enter side 3: ");
        double c = s.nextDouble();
        triangle.setDimensions(a,b,c);

        System.out.println("For Equilateral Triangle: : ");
        System.out.println("    Enter side: ");
        double side = s.nextDouble();
        equilateralTriangle.setDimensions(side);

        System.out.println("For 1st shape:");
        System.out.println("    Name:"+square.getName());
        System.out.println("    Dimensions:");
        square.printDimensions();
        System.out.println("    Area: "+square.getArea());

        System.out.println("For 2nd shape:");
        System.out.println("    Name:"+circle.getName());
        System.out.println("    Dimensions:");
        circle.printDimensions();
        System.out.println("    Area: "+circle.getArea());

        System.out.println("For 3rd shape:");
        System.out.println("    Name:"+triangle.getName());
        System.out.println("    Dimensions:");
        triangle.printDimensions();
        System.out.println("    Area: "+triangle.getArea());

        System.out.println("For 4th shape:");
        System.out.println("    Name:"+equilateralTriangle.getName());
        System.out.println("    Dimensions:");
        equilateralTriangle.printDimensions();
        System.out.println("    Area: "+equilateralTriangle.getArea());
    }
}
