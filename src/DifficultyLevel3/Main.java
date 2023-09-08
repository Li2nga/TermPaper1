package DifficultyLevel3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        EmployeeBook staffbook = new EmployeeBook(10);
        staffbook.addNewEmployee("FIO", 1, 10_000_00);
        staffbook.addNewEmployee("FIO", 2, 10_000_00);
        staffbook.addNewEmployee("FIO", 5, 10_000_00);
        staffbook.addNewEmployee("FIO", 5, 10_000_00);
        staffbook.addNewEmployee("FIO", 3, 10_000_00);
        staffbook.addNewEmployee("FIO", 4, 10_000_00);
        staffbook.addNewEmployee("FIO", 5, 10_000_00);
        staffbook.addNewEmployee("FIO", 1, 10_000_00);
        staffbook.addNewEmployee("FIO", 2, 10_000_00);




        staffbook.deletingEmployee(1);
        System.out.println(staffbook);

        staffbook.deletingEmployeeFIO("FIO", 5);
        System.out.println(staffbook);
        System.out.println("_________________________________________");
        staffbook.employeeСhange(2, 20_000_00, 1);
        System.out.println(staffbook);
        System.out.println("_________________________________________");
        staffbook.printListEmployeesDepartment();
    }


}
