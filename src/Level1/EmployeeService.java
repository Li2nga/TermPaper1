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
            if (employee != null && employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
            }
        }
        int a = 0;
        for (Employee employee : staffbook) {
            if (employee != null && minSalary == employee.getSalary()) {
                a++;
            }

        }
        Employee[] minimumWageЕmployees = new Employee[a];
        int index = 0;
        for (Employee employee : staffbook) {
            if (employee != null && minSalary == employee.getSalary()) {
                minimumWageЕmployees[index++] = employee;
            }
        }
        return minimumWageЕmployees;
    }

    //////////////////////////////////////////////////////////////////////////////////////
    public static Employee[] maxWageЕmployees(Employee[] staffbook) {
        int maxSalary = Integer.MIN_VALUE;
        for (Employee employee : staffbook) {
            if (employee != null && employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
            }
        }
        int b = 0;
        for (Employee employee : staffbook) {
            if (employee != null && maxSalary == employee.getSalary()) {
                b++;
            }

        }
        Employee[] maxWageЕmployees = new Employee[b];
        int index = 0;
        for (Employee employee : staffbook) {
            if (employee != null && maxSalary == employee.getSalary()) {
                maxWageЕmployees[index++] = employee;
                System.out.println();
            }
        }
        return maxWageЕmployees;
    }

    //////////////////////////////////////////////////////////////////////////////////////


    public static double averageSalary(Employee[] staffbook) {
        int amountSalaries = 0;
        int a = 0;
        for (Employee employee : staffbook) {
            if (employee != null) {
                amountSalaries += employee.getSalary();
                a++;
            }
        }
        return (double) amountSalaries / a;
    }

    ///////////////////////////////////////////////////////////////////////////////////////

    public static void outputConsoleFullNamesEmployees(Employee[] staffbook) {

        for (int i = 0; i < staffbook.length; i++) {
            if (staffbook[i] != null) {
                System.out.println(staffbook[i].getFullName());
            }
        }
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////
    public static void salaryIndexation(Employee[] staffbook, double indexationPercentage) {

        for (Employee employee : staffbook) {
            if (employee != null) {
                employee.setSalary((int) Math.round(employee.getSalary() * indexationPercentage/100 + employee.getSalary()));
            }

        }
    }

    //////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static Employee[] minimumWageDepartament(Employee[] staffbook, int department) {
        int minSalary = Integer.MAX_VALUE;
        for (Employee employee : staffbook) {
            if (employee != null && employee.getSalary() < minSalary && employee.getDepartment() == department) {
                minSalary = employee.getSalary();
            }
        }
        int a = 0;
        for (Employee employee : staffbook) {
            if (employee != null && minSalary == employee.getSalary() && employee.getDepartment() == department) {
                a++;
            }

        }
        Employee[] minimumWageЕmployees = new Employee[a];
        int index = 0;
        for (Employee employee : staffbook) {
            if (employee != null && minSalary == employee.getSalary() && employee.getDepartment() == department) {
                minimumWageЕmployees[index++] = employee;
            }
        }
        return minimumWageЕmployees;
    }


    public static Employee[] maxWageDepartament(Employee[] staffbook, int department) {
        int maxSalary = Integer.MIN_VALUE;
        for (Employee employee : staffbook) {
            if (employee != null && employee.getSalary() > maxSalary && employee.getDepartment() == department) {
                maxSalary = employee.getSalary();
            }
        }
        int b = 0;
        for (Employee employee : staffbook) {
            if (employee != null && maxSalary == employee.getSalary() && employee.getDepartment() == department) {
                b++;
            }

        }
        Employee[] maxWageЕmployees = new Employee[b];
        int index = 0;
        for (Employee employee : staffbook) {
            if (employee != null && maxSalary == employee.getSalary() && employee.getDepartment() == department) {
                maxWageЕmployees[index++] = employee;
                System.out.println();
            }
        }
        return maxWageЕmployees;
    }

    public static long payrollСostsDepartament(Employee[] staffbook, int department) {
        int amountSalaries = 0;
        for (Employee employee : staffbook) {
            if (employee != null && employee.getDepartment() == department) {
                amountSalaries += employee.getSalary();
            }
        }
        return amountSalaries;
    }
    public static double averageSalaryDepartament(Employee[] staffbook,int department) {
        int amountSalaries = 0;
        int a = 0;
        for (Employee employee : staffbook) {
            if (employee != null&& employee.getDepartment() == department) {
                amountSalaries += employee.getSalary();
                a++;
            }
        }
        return (double) amountSalaries / a;
    }
    public static void salaryIndexationDepartament(Employee[] staffbook, double indexationPercentage, int department ) {

        for (Employee employee : staffbook) {
            if (employee != null&& employee.getDepartment() == department) {
                employee.setSalary((int) Math.round(employee.getSalary() * indexationPercentage/100 + employee.getSalary()));
            }
        }
    }
    public static void printDepartmentEmployees(Employee[] staffbook, int department) {
        
        for (int i = 0; i < staffbook.length; i++) {
            if (staffbook[i] != null && staffbook[i].getDepartment() == department)

        {
                System.out.println(staffbook[i].getFullName() + ";" + staffbook[i].getSalary());
            }
        }
    }
    public static void listEemployeesLessSalary(Employee[] staffbook, int targetSalary) {

        for (int i = 0; i < staffbook.length; i++) {
            if (staffbook[i] != null && staffbook[i].getSalary() <= targetSalary)
            {
                System.out.println(staffbook[i].getFullName() + ";" + staffbook[i].getSalary() + ";" + staffbook[i].getId());
            }
        }

    }
    public static void listEemployeesHigherSalary(Employee[] staffbook, int targetSalary) {

        for (int i = 0; i < staffbook.length; i++) {
            if (staffbook[i] != null && staffbook[i].getSalary() >= targetSalary)
            {
                System.out.println(staffbook[i].getFullName() + ";" + staffbook[i].getSalary() + ";" + staffbook[i].getId());
            }
        }

    }


}
