import java.util.Scanner;
class Shape {
    double d1, d2;
    void getData(double d1, double d2) {
        this.d1 = d1;
        this.d2 = d2;
    }
}
class Triangle extends Shape {
    double getArea() {
        return 0.5 * d1 * d2;
    }
}
class Rectangle extends Shape {
    double getArea() {
        return d1 * d2;
    }
}
public class CES4_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base of Triangle: ");
        double b = sc.nextDouble();
        System.out.print("Enter height of Triangle: ");
        double h = sc.nextDouble();
        Triangle t = new Triangle();
        t.getData(b, h);
        System.out.print("\nEnter length of Rectangle: ");
        double l = sc.nextDouble();
        System.out.print("Enter width of Rectangle: ");
        double w = sc.nextDouble();
        Rectangle r = new Rectangle();
        r.getData(l, w);
        System.out.println("\n--- Results ---");
        System.out.println("Area of Triangle: " + t.getArea());
        System.out.println("Area of Rectangle: " + r.getArea());
        sc.close();
    }
}
