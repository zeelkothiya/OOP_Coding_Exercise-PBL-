import mypack.Salary1;

public class m_pack {
    public static void main(String[] args) {
        int sal, net_salary;
        Salary1 s = new Salary1();
        sal = s.computersalary(5000);
        net_salary = sal - s.pfund(5000);
        System.out.println("total salary is: " + sal);
        System.out.println("net salary is: " + net_salary);
    }
}