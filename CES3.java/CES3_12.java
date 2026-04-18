import java.util.Scanner;
class VolumeCalculator {
    double calculateVolume(double side) {
        return side * side * side;
    }
    double calculateVolume(double length, double width, double height) {
        return length * width * height;
    }
    double calculateVolume(double radius, boolean isSphere) {
        return (4.0 / 3.0) * Math.PI * radius * radius * radius;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VolumeCalculator vc = new VolumeCalculator();
        System.out.print("Enter side of Cube: ");
        double side = sc.nextDouble();
        System.out.println("Volume of Cube: " + vc.calculateVolume(side));
        System.out.print("\nEnter length of Cuboid: ");
        double l = sc.nextDouble();
        System.out.print("Enter width of Cuboid: ");
        double w = sc.nextDouble();
        System.out.print("Enter height of Cuboid: ");
        double h = sc.nextDouble();
        System.out.println("Volume of Cuboid: " + vc.calculateVolume(l, w, h));
        System.out.print("\nEnter radius of Sphere: ");
        double r = sc.nextDouble();
        System.out.println("Volume of Sphere: " + vc.calculateVolume(r, true));
        sc.close();
    }
}
