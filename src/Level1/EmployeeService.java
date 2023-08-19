package Level1;

public class EmployeeService {
    public static int payrollСosts(Employee[] staffbook) {
        int amountSalaries = 0;
        for (Employee employee : staffbook) {
            if (employee != null) {
                amountSalaries += employee.getSalary();
            }
        }
        return amountSalaries;
    }

    public static Employee[] minimumWage(Employee[] staffbook) {
        int minSalary = Integer.MAX_VALUE;
        for (Employee employee : staffbook) {
            if (employee.getSalary() < minSalary) {

               minSalary =  employee.getSalary() ;
            }
        }
        ///////////////////////////////////////////////////////////////////////////////
        int a = 0;
        for (Employee employee : staffbook) {
            if (minSalary ==  employee.getSalary()) {
                 a++;
            }

        }
        Employee[] minimumWageЕmployees = new Employee[a];
        int index = 0;
        for (Employee employee : staffbook) {
            if (minSalary ==  employee.getSalary()) {
                minimumWageЕmployees[index++] = employee;
            }
            }
        return minimumWageЕmployees;
    }

}


