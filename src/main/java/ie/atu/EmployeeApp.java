package ie.atu;


public class EmployeeApp {
    public static void main(String[] args) {

        Employee info= new Employee();
        ShiftWorker info2 = new ShiftWorker();
        ShiftSupervisor info3 = new ShiftSupervisor();

        info.getReportDetails();
        info.displayInfo();

        info2.getReportDetails();
        info2.displayInfo2();

        info3.getReportDetails();
        info3.displayInfo3();
    }
}