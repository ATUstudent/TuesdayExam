package ie.atu;

import java.util.Scanner;
public class Employee {
    String EmployeeName;
    String EmployeeID;

    public Employee(){
        this.EmployeeName = EmployeeName;
        this.EmployeeID = EmployeeID;
    }
    public void getReportDetails(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Employee Name : ");
        this.EmployeeName = scanner.nextLine();

        System.out.println("Enter Employee ID : ");
        this.EmployeeID = scanner.nextLine();
        }
        public void displayInfo(){
        System.out.println("Employee Name " + EmployeeName + " Employee ID" + EmployeeID);
    }
}
