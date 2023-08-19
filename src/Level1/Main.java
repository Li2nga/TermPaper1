package Level1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Employee [] staffBook = new Employee [10];
        System.out.println(Arrays.toString(staffBook));
        staffBook [0] = new Employee("ФИО1", "Департамент1", 70_000_00);
        staffBook [1] = new Employee("ФИО2", "Департамент2", 80_000_00);
        staffBook [2] = new Employee("ФИО3", "Департамент3", 60_000_00);
        staffBook [3] = new Employee("ФИО4", "Департамент4", 90_000_00);
        staffBook [4] = new Employee("ФИО5", "Департамент5", 65_000_00);
        staffBook [5] = new Employee("ФИО6", "Департамент6", 65_000_00);
        staffBook [6] = new Employee("ФИО7", "Департамент7", 65_000_00);
        staffBook [7] = new Employee("ФИО8", "Департамент8", 65_000_00);
        staffBook [8] = new Employee("ФИО9", "Департамент9", 65_000_00);


        System.out.println(Arrays.toString(staffBook));

        EmployeeService.payrollСosts();


        System.out.println("EmployeeService.payrollСosts(staffBook) = " + EmployeeService.payrollСosts(staffBook));

    }


}
