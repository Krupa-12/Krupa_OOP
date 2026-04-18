import java.util.Scanner;
class College {
    String collegeName;
    College(String collegeName) {
        this.collegeName = collegeName;
    }
    class Admission {
        String studentName;
        String course;
        void acceptDetails() {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter student name: ");
            studentName = sc.nextLine();

            System.out.print("Enter course: ");
            course = sc.nextLine();
        }
        void displayDetails() {
            System.out.println("\n--- Admission Details ---");
            System.out.println("College Name: " + collegeName); // accessing outer class variable
            System.out.println("Student Name: " + studentName);
            System.out.println("Course: " + course);
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter college name: ");
        String cname = sc.nextLine();
        College college = new College(cname);
        College.Admission admission = college.new Admission();
        admission.acceptDetails();
        admission.displayDetails();
        sc.close();
    }
}
