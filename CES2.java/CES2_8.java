import java.util.Scanner;
class Point {
    private int x;
    private int y;
    Point() {
        this.x = 5;
        this.y = 5;
    }
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    Point(Point p) {
        this.x = p.x;
        this.y = p.y;
    }
    void display() {
        System.out.println("Point coordinates: (" + x + ", " + y + ")");
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Default Constructor:");
        Point p1 = new Point();
        p1.display();
        System.out.print("\nEnter x coordinate: ");
        int x = sc.nextInt();
        System.out.print("Enter y coordinate: ");
        int y = sc.nextInt();
        Point p2 = new Point(x, y);
        System.out.println("Parameterized Constructor:");
        p2.display();
        Point p3 = new Point(p2);
        System.out.println("Copy Constructor (copy of parameterized object):");
        p3.display();
        sc.close();
    }
}
