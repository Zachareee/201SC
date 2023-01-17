import java.util.Scanner;

public class CompanyTest {

    public static void main(String[] args) {
        Company UMS = new Company("UMS");
        Spouse Kate = new Spouse("Kate", 37);
        Employee John = new Employee("John", 5, 2500, 'M', Kate);

        UMS.addEmployee(John);
        System.out.printf("Total salary(before): $%.1f%n%n",UMS.getAllEmployeesSalary());

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ID: ");
        int ID = sc.nextInt();
        sc.nextLine();
        
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        
        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter gender: ");
        char gender = sc.nextLine().charAt(0);

        UMS.addEmployee(new Employee(name, ID, salary, gender));
        System.out.printf("%nTotal salary(after addition): $%.1f%n%n",
                          UMS.getAllEmployeesSalary());

        checkEmployee(UMS, 4);
        checkEmployee(UMS, 5);
    }
                                
    public static void checkEmployee(Company comp, int id) {
        Employee employed = comp.getEmployee(id);
        System.out.printf("Name: %s, Salary: $%.2f, Status: %s%n",
                                employed.getName(),
                                employed.getSalary(),
                                (employed.getSpouse() == null ?
                                "Single\nHe/she doesn't have a spouse" :
                                "Married\nSpouse's name: " +
                                employed.getSpouse().getName()));
    }
}
