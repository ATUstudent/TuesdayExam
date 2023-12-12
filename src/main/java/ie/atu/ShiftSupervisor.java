package ie.atu;

import java.util.Scanner;
public class ShiftSupervisor extends ShiftWorker{
    double annualSalary;

    public ShiftSupervisor(){
        this.annualSalary = annualSalary;
    }

    public void getReportDetails(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Employee's Name : ");
        this.EmployeeName = scanner.nextLine();

        System.out.println("Payroll number : ");
        this.payRoll = scanner.nextInt();

        System.out.println("Shift Number ");
        this.shift = scanner.nextInt();

        System.out.println("The annually salary ");
        this.annualSalary = scanner.nextDouble();
    }
    public void displayInfo3(){
        System.out.println("" + EmployeeName + "" + payRoll + "" + shift+ "" + annualSalary);
    }
}
