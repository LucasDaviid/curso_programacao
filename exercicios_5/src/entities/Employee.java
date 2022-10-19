package entities;

public class Employee {

    public String name;
    public double grossSalary;
    public double tax;

    public double netSalary(){
        grossSalary = grossSalary - tax;
        return grossSalary;
    }

    public void increaseSalary (double percentage){
        grossSalary += (grossSalary + tax) / percentage;
    }

    public String toString() {
        return name + ", $ " + String.format("%.2f", grossSalary);
    }
}
