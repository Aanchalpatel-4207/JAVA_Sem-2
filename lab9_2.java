interface Shape 
{
    double getArea();
}

class Rectangle implements Shape 
{
    private double length, width;

    public Rectangle(double length, double width) 
    {
        this.length = length;
        this.width = width;
    }

    public double getArea() 
    {
        return length * width;
    }
}


class Circle implements Shape 
{
    double radius;
    private static final double PI = 3.141592653589793;

    public Circle(double radius) 
    {
        this.radius = radius;
    }

    public double getArea() 
    {
        return PI * radius * radius;
    }
}


class Triangle implements Shape 
{
    double base, height;

    public Triangle(double base, double height) 
    {
        this.base = base;
        this.height = height;
    }


    public double getArea() 
    {
        return 0.5 * base * height;
    }
}

public class lab9_2 
{
    public static void main(String[] args) 
    {
        Rectangle r1 = new Rectangle(10, 5);
        Circle c1 = new Circle(7);
        Triangle t1 = new Triangle(6, 4);

        System.out.println("Rectangle Area: " + r1.getArea());
        System.out.println("Circle Area: " + c1.getArea());
        System.out.println("Triangle Area: " + t1.getArea());
    }
}
