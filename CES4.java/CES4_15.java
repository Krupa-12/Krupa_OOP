import java.util.Scanner;
class Employee {
    String name;
    String department;
    void displayDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee Name: ");
        name = sc.nextLine();
        System.out.print("Enter Department: ");
        department = sc.nextLine();
        System.out.println("\n       Employee Details ");
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
    }
}
class Manager extends Employee {
    int teamSize;
    String projectName;
    @Override
    void displayDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Manager Name: ");
        name = sc.nextLine();
        System.out.print("Enter Department: ");
        department = sc.nextLine();
        System.out.print("Enter Team Size: ");
        teamSize = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Enter Project Name: ");
        projectName = sc.nextLine();
        System.out.println("\n      Manager Details");
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Team Size: " + teamSize);
        System.out.println("Project Name: " + projectName);
    }
}
public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.displayDetails();
        System.out.println("\n-------------------------\n");
        Employee mgr = new Manager();
        mgr.displayDetails(); 
    }
}
