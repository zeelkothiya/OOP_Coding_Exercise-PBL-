//AIM practical-7
/*Create an Employee class with private instance variables for employeeName (String) and
employeeSalary (double). Implement public methods readEmployeeData() (to take input from the
user) and displayEmployeeData() (to print the employee's name and salary). Demonstrate object
creation and method invocation in a main method. */

import java.util.Scanner;

class Employee {
    private String employeeName;
    private double employeeSalary;

    void readEmployeeData() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee Name: ");
        employeeName = sc.nextLine();

        System.out.print("Enter Employee Salary: ");
        employeeSalary = sc.nextDouble();
    }

    void displayEmployeeData() {
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Employee Salary: " + employeeSalary);
    }

    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.readEmployeeData();
        emp.displayEmployeeData();
    }
}

