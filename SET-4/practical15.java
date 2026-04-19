//AIM
/*Create a base class named Employee that contains a method displayDetails() which prints general
employee details such as name and department. Now create a subclass Manager that inherits from
Employee and overrides the displayDetails() method to include additional information such as the
manager's team size or project name. In the main method, create objects of both Employee and
Manager classes and call the displayDetails() method using each object to show how Java
determines which version of the method to execute at runtime. */

import java.util.Scanner;

class Employee {
    String name;
    String department;

    void getData(String name, String dept) {
        this.name = name;
        this.department = dept;
    }

    void displayDetails() {
        System.out.println("Employee Details");
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
    }
}

class Manager extends Employee {
    int teamSize;

    void getManagerData(String name, String dept, int size) {
        getData(name, dept);
        teamSize = size;
    }

    void displayDetails() {
        System.out.println("Manager Details");
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Team Size: " + teamSize);
    }
}

public class practical15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter employee name: ");
        String name = sc.nextLine();

        System.out.print("Enter department: ");
        String dept = sc.nextLine();

        Employee ref;

        System.out.print("Enter 1 for Employee, 2 for Manager: ");
        int choice = sc.nextInt();

        if (choice == 1) {
            ref = new Employee();
            ref.getData(name, dept);
        } else {
            Manager m = new Manager();
            System.out.print("Enter team size: ");
            int size = sc.nextInt();
            m.getManagerData(name, dept, size);
            ref = m;
        }

        ref.displayDetails();
    }
}
