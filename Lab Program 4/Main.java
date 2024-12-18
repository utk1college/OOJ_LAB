import java.util.Scanner;

abstract class Shape {
    int dimension1;
    int dimension2;

    abstract void printArea();
}

class Rectangle extends Shape {
    Rectangle(int length, int breadth) {
        this.dimension1 = length;
        this.dimension2 = breadth;
    }

    @Override
    void printArea() {
        System.out.println("Area of Rectangle: " + (dimension1 * dimension2));
    }
}

class Triangle extends Shape {
    Triangle(int base, int height) {
        this.dimension1 = base;
        this.dimension2 = height;
    }

    @Override
    void printArea() {
        System.out.println("Area of Triangle: " + (0.5 * dimension1 * dimension2));
    }
}

class Circle extends Shape {
    Circle(int radius) {
        this.dimension1 = radius;
    }

    @Override
    void printArea() {
        System.out.println("Area of Circle: " + (Math.PI * dimension1 * dimension1));
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length and breadth of rectangle: ");
        int length = sc.nextInt();
        int breadth = sc.nextInt();
        Shape rectangle = new Rectangle(length, breadth);

        System.out.print("Enter base and height of triangle: ");
        int base = sc.nextInt();
        int height = sc.nextInt();
        Shape triangle = new Triangle(base, height);

        System.out.print("Enter radius of circle: ");
        int radius = sc.nextInt();
        Shape circle = new Circle(radius);

        System.out.println();
        rectangle.printArea();
        triangle.printArea();
        circle.printArea();

        System.out.println("UTKRISHT UMANG\n1BM23ET056");
        sc.close();
    }
}
