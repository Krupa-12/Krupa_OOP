import java.util.Scanner;
class Rectangle {
    double width;
    double height;
    Rectangle() {
        this.width = 1;
        this.height = 1;
    }
    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    double getArea() {
        return width * height;
    }
    double getPerimeter() {
        return 2 * (width + height);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter width: ");
        double w = sc.nextDouble();
        System.out.print("Enter height: ");
        double h = sc.nextDouble();
        if (w <= 0 || h <= 0) {
            System.out.println("Invalid input! Width and height must be positive.");
        } else {
            Rectangle rect = new Rectangle(w, h);
            System.out.printf("Area of rectangle: %.2f\n", rect.getArea());
            System.out.printf("Perimeter of rectangle: %.2f\n", rect.getPerimeter());
        }
        sc.close();
    }
}
