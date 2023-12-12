package ie.atu;

import java.util.Scanner;
public class ShiftWorker extends Employee {
    int shift;
    int payRoll;
    double payRate;

    public ShiftWorker(){
        this.shift = shift;
        this.payRoll = payRoll;
        this.payRate = payRate;
    }
    public void getReportDetails(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Day Shift(1) or Night Shift(2) : ");
        this.shift = scanner.nextInt();

        System.out.println("PayRoll Number : ");
        this.payRoll = scanner.nextInt();

        System.out.println("Hour pay rate: ");
        this.payRate = scanner.nextDouble();

        System.out.println("Employee Name");
        this.EmployeeName = scanner.nextLine();
    }

    public void displayInfo2(){
       System.out.println("" + EmployeeName + "" + shift +""+ payRoll + ""+ payRate);
    }
}
