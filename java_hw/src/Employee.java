import java.util.Scanner;
/**
 * @author Alejandra Franco González
 * */
public class Employee {
    private String firstName,lastName;
    private int age, employeeNumber;

    public Employee() {}
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getAge() {
        return age;
    }
    public int getEmployeeNumber() {
        return employeeNumber;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmployeeNumber(int employeeNumber) {
        this.employeeNumber = employeeNumber;
    }
    public String generateEmail() {
        return this.firstName.toLowerCase()+"."+this.lastName.toLowerCase()+"@mentormakers.com";
    }

    @Override
    public String toString() {
        System.out.println("====== EMPLOYEE'S DATA ======");
        return "First Name: "+getFirstName()+
                "\n"+"Last Name: "+getLastName()+
                "\n"+"Age: "+getAge()+
                "\n"+"Employee Number: "+getEmployeeNumber()+
                "\n"+"Email: "+generateEmail()+
                "\n";
    }

    public static void main(String[] args) {
        Employee firstEmployee = new Employee();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter First Name: ");
        firstEmployee.setFirstName(scanner.nextLine());

        System.out.print("Enter Last Name: ");
        firstEmployee.setLastName(scanner.nextLine());

        System.out.print("Enter Age: ");
        firstEmployee.setAge(Integer.parseInt(scanner.nextLine()));

        System.out.print("Enter Employee Number: ");
        firstEmployee.setEmployeeNumber(Integer.parseInt(scanner.nextLine()));

        System.out.println(firstEmployee);

    }
}
