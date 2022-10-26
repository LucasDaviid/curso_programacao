import entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int x;

        List<Employee> list = new ArrayList<>();

        // PART 1 - READING DATA:

        System.out.print("How many employees will be registered? ");
        x = sc.nextInt();

        for (int i=1; i<=x; i++){
            System.out.println("Emplyoee #" + i);
            System.out.print("ID: ");
            int id = sc.nextInt();
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();

            list.add(new Employee(id, name, salary));
        }

        // PART 2 - UPDATING SALARY OF GIVEN EMPLOYEE:

        System.out.print("\nEnter the employee id that will have salary increase : ");
        int id = sc.nextInt();
        Employee emp = list.stream().filter(y -> y.getId() == id).findFirst().orElse(null);

        if (emp == null){
            System.out.println("This id does not exist!");
        }
        else {
            System.out.print("Enter the percentage: ");
            double percentage = sc.nextDouble();
            emp.increaseSalary(percentage);
        }

        // PART 3 - LISTING EMPLOYEES:

        for(Employee obj: list){
            System.out.println(obj);
        }


        sc.close();
    }
}