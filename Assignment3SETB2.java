/* 2. Define a class Employee having private members-id, name, department, salary. Define default & 
parameterized constructors. Create a subclass called Manager with private member bonus. Define 
methods accept & display in both the classes. Create n objects of the manager class & display the 
details of the manager having the maximum total salary(salary+bonus).  */
import java.util.Scanner;

class Employee {
    private int member_id;
    private String name;
    private String department;
    private int salary;

    public Employee() {
        this(0, "", "", 0);
    }

    public Employee(int mi, String n, String dp, int sal) {
        this.member_id = mi;
        this.name = n;
        this.department = dp;
        this.salary = sal;
    }

    public int getSalary() {
        return salary;
    }

    public void accept(Scanner sc) {
        System.out.print("Enter member ID: ");
        member_id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter name: ");
        name = sc.nextLine();
        System.out.print("Enter department: ");
        department = sc.nextLine();
        System.out.print("Enter salary: ");
        salary = sc.nextInt();
    }

    public void display() {
        System.out.println("Member ID:" + member_id);
        System.out.println("Member NAME:" + name);
        System.out.println("Department:" + department);
        System.out.println("Salary:" + salary);
    }

  
}

class Manager extends Employee {
    private int bonus;
    
    public Manager() {
        super();
        this.bonus = 0;
    }

    public Manager(int id, String name, String dp, int sal, int b) {
        super(id, name, dp, sal);
       
        this.bonus = b;
        
    }

    public void accept(Scanner sc) {
        super.accept(sc);
        System.out.print("Enter bonus: ");
        bonus = sc.nextInt();
    }

    public void display() {
        super.display();
        System.out.println("==Manager==");
        System.out.println("Member Bonus:" + bonus);
        System.out.println("Total Salary:" + getTotalSalary());
    }

    public int getTotalSalary() {
        return getSalary()+bonus;
    }
}

public class Assignment3SETB2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many records you want to record: ");
        int n = sc.nextInt();
        Manager[] managers = new Manager[n];

        for (int i = 0; i < n; i++) {
            managers[i] = new Manager();
            System.out.println("Enter details for Manager " + (i + 1));
            managers[i].accept(sc);
        }

        Manager maxManager = managers[0];
        for (int i = 1; i < n; i++) {
            if (managers[i].getTotalSalary() > maxManager.getTotalSalary()) {
                maxManager = managers[i];
            }
        }

        System.out.println("Manager with maximum total salary:");
        maxManager.display();
        sc.close();
    }
}