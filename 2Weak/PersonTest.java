import java.util.Scanner;

public class PersonTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter details of the first person:");
        System.out.print("Enter first name : ");
        String firstName = sc.nextLine();

        System.out.print("Enter last name : ");
        String lastName = sc.nextLine();

        System.out.print("Enter age : ");
        int age = sc.nextInt();
        sc.nextLine();

        Person currentPerson = new Person(firstName, lastName, age);
        System.out.println(currentPerson);
        System.out.println();

        System.out.println("Enter detail of the second person: ");
        System.out.print("Enter first name : ");
        firstName = sc.nextLine();

        System.out.print("Enter last name : ");
        lastName = sc.nextLine();
        currentPerson = new Person(firstName, lastName);

        System.out.println(currentPerson);
        System.out.println();

        System.out.print("Enter age of second person : ");
        age = sc.nextInt();
        currentPerson.setAge(age);
        System.out.println();

        System.out.println("After setting age of otherPerson");
        System.out.println(currentPerson);
    }
}
