package Level1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Employee [] staffBook = new Employee [10];
        System.out.println(Arrays.toString(staffBook));
        staffBook [0] = new Employee("ФИО1", 1, 70_000_00);
        staffBook [1] = new Employee("ФИО2", 4, 60_000_00);
        staffBook [2] = new Employee("ФИО3", 3, 60_000_00);
        staffBook [3] = new Employee("ФИО4", 4, 90_000_00);
        staffBook [4] = new Employee("ФИО5", 5, 90_000_00);
//        staffBook [5] = new Employee("ФИО6", "Департамент6", 65_000_00);
//        staffBook [6] = new Employee("ФИО7", "Департамент7", 65_000_00);
//        staffBook [7] = new Employee("ФИО8", "Департамент8", 65_000_00);
//        staffBook [8] = new Employee("ФИО9", "Департамент9", 65_000_00);


        System.out.println(Arrays.toString(staffBook));


        System.out.println("EmployeeService.payrollСosts(staffBook) = " + EmployeeService.payrollСosts(staffBook));


        System.out.println("EmployeeService.minimumWage(staffBook) = " + Arrays.toString(EmployeeService.minimumWage(staffBook)));
        System.out.println("EmployeeService.maxWageЕmployees(staffBook) = " + Arrays.toString(EmployeeService.maxWageЕmployees(staffBook)));

        System.out.println("EmployeeService.AverageSalary(staffBook) = " + EmployeeService.averageSalary(staffBook));

        System.out.println("------------------------------------------------");
        EmployeeService.outputConsoleFullNamesEmployees(staffBook);


        //задача: проиндексеривать зп
        EmployeeService.salaryIndexation(staffBook, 10);

        System.out.println("------------------------------------------------");
        
        System.out.println(Arrays.toString(staffBook));


        { System.out.println(Arrays.toString(EmployeeService.minimumWageDepartament(staffBook, 3)));

        System.out.println(Arrays.toString(EmployeeService.maxWageDepartament(staffBook, 4)));


        System.out.println(EmployeeService.payrollСostsDepartament(staffBook, 4));

            System.out.println("EmployeeService.averageSalaryDepartament(staffBook, 4) = " + EmployeeService.averageSalaryDepartament(staffBook, 4)/100);

       EmployeeService.salaryIndexationDepartament(staffBook,10, 1);

            System.out.println("------------------------------------------------");

            System.out.println(Arrays.toString(staffBook));

            System.out.println("------------------------------------------------");

            EmployeeService.printDepartmentEmployees(staffBook,4);

            System.out.println("------------------------------------------------");

            EmployeeService.listEemployeesLessSalary(staffBook,90000000 );

            System.out.println("------------------------------------------------");

            EmployeeService.listEemployeesHigherSalary(staffBook, 9000000);
        }


    }

}
