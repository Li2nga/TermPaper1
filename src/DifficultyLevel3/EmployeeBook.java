package DifficultyLevel3;

import java.util.Arrays;

public class EmployeeBook {

    private Employee[] staffBook;

    public EmployeeBook(int pages) {
        staffBook = new Employee[pages];
    }

    public void addNewEmployee(String fullName, int department, int salary) {
        for (int i = 0; i < staffBook.length; i++) {
            if (staffBook[i] == null) {
                staffBook[i] = new Employee(fullName, department, salary);
                break;
            }
            if (i == staffBook.length - 1) {
                throw new RuntimeException("В книге нет пустых строк");
            }
        }
    }

    @Override
    public String toString() {
        String s = null;
        if (staffBook[0] != null && staffBook.length != 1) {
            s = staffBook[0].getFullName() + ", " + staffBook[0].getDepartment() + ", " + staffBook[0].getSalary() + ", " + staffBook[0].getId() + '\n';
        } else s = "null" + '\n';

        for (int i = 1; i < staffBook.length - 1; i++) {
            if (staffBook[i] != null) {
                s += staffBook[i].getFullName() + ", " + staffBook[i].getDepartment() + ", " + staffBook[i].getSalary() + ", " + staffBook[i].getId() + '\n';
            } else s += "null" + '\n';
        }
        if (staffBook[staffBook.length - 1] != null && staffBook.length != 1) {
            s += staffBook[staffBook.length - 1].getFullName() + ", " + staffBook[staffBook.length - 1].getDepartment() + ", " + staffBook[staffBook.length - 1].getSalary() + ", " + staffBook[staffBook.length - 1].getId();
        } else if (staffBook.length != 1) {
            s += "null";
        } else if (staffBook[staffBook.length - 1] != null) {
            s = staffBook[staffBook.length - 1].getFullName() + ", " + staffBook[staffBook.length - 1].getDepartment() + ", " + staffBook[staffBook.length - 1].getSalary() + ", " + staffBook[staffBook.length - 1].getId();
        }
        return s;
    }

    public int payrollСosts() {
        int amountSalaries = 0;
        for (Employee employee : staffBook) {
            if (employee != null) {
                amountSalaries += employee.getSalary();
            }
        }
        return amountSalaries;
    }

    public Employee[] minimumWageЕmployees() {
        int minSalary = Integer.MAX_VALUE;
        for (Employee employee : staffBook) {
            if (employee != null && employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
            }
        }
        int a = 0;
        for (Employee employee : staffBook) {
            if (employee != null && minSalary == employee.getSalary()) {
                a++;
            }
        }
        Employee[] minimumWageЕmployees = new Employee[a];
        int index = 0;
        for (Employee employee : staffBook) {
            if (employee != null && minSalary == employee.getSalary()) {
                minimumWageЕmployees[index++] = employee;
            }
        }
        return minimumWageЕmployees;
    }
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////

    public Employee[] maxWageЕmployees() {
        int maxSalary = Integer.MIN_VALUE;
        for (Employee employee : staffBook) {
            if (employee != null && employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
            }
        }
        int b = 0;
        for (Employee employee : staffBook) {
            if (employee != null && maxSalary == employee.getSalary()) {
                b++;
            }

        }
        Employee[] maxWageЕmployees = new Employee[b];
        int index = 0;
        for (Employee employee : staffBook) {
            if (employee != null && maxSalary == employee.getSalary()) {
                maxWageЕmployees[index++] = employee;
                System.out.println();
            }
        }
        return maxWageЕmployees;
    }
    ///////////////////////////////////////////////////////////////////////////////////////////////////////

    public double averageSalary() {
        int amountSalaries = 0;
        int a = 0;
        for (Employee employee : staffBook) {
            if (employee != null) {
                amountSalaries += employee.getSalary();
                a++;
            }
        }
        return (double) amountSalaries / a;
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////

    public void outputConsoleFullNamesEmployees() {

        for (int i = 0; i < staffBook.length; i++) {
            if (staffBook[i] != null) {
                System.out.println(staffBook[i].getFullName());
            }
        }
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////

    public void salaryIndexation(double indexationPercentage) {

        for (Employee employee : staffBook) {
            if (employee != null) {
                employee.setSalary((int) Math.round(employee.getSalary() * indexationPercentage / 100 + employee.getSalary()));
            }
        }
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////

    public Employee[] minimumWageDepartament(int department) {
        int minSalary = Integer.MAX_VALUE;
        for (Employee employee : staffBook) {
            if (employee != null && employee.getSalary() < minSalary && employee.getDepartment() == department) {
                minSalary = employee.getSalary();
            }
        }
        int a = 0;
        for (Employee employee : staffBook) {
            if (employee != null && minSalary == employee.getSalary() && employee.getDepartment() == department) {
                a++;
            }

        }
        Employee[] minimumWageЕmployees = new Employee[a];
        int index = 0;
        for (Employee employee : staffBook) {
            if (employee != null && minSalary == employee.getSalary() && employee.getDepartment() == department) {
                minimumWageЕmployees[index++] = employee;
            }
        }
        return minimumWageЕmployees;
    }
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public Employee[] maxWageDepartament(int department) {
        int maxSalary = Integer.MIN_VALUE;
        for (Employee employee : staffBook) {
            if (employee != null && employee.getSalary() > maxSalary && employee.getDepartment() == department) {
                maxSalary = employee.getSalary();
            }
        }
        int b = 0;
        for (Employee employee : staffBook) {
            if (employee != null && maxSalary == employee.getSalary() && employee.getDepartment() == department) {
                b++;
            }

        }
        Employee[] maxWageЕmployees = new Employee[b];
        int index = 0;
        for (Employee employee : staffBook) {
            if (employee != null && maxSalary == employee.getSalary() && employee.getDepartment() == department) {
                maxWageЕmployees[index++] = employee;
                System.out.println();
            }
        }
        return maxWageЕmployees;
    }
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public long payrollСostsDepartament(int department) {
        int amountSalaries = 0;
        for (Employee employee : staffBook) {
            if (employee != null && employee.getDepartment() == department) {
                amountSalaries += employee.getSalary();
            }
        }
        return amountSalaries;
    }
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public double averageSalaryDepartament(int department) {
        int amountSalaries = 0;
        int a = 0;
        for (Employee employee : staffBook) {
            if (employee != null && employee.getDepartment() == department) {
                amountSalaries += employee.getSalary();
                a++;
            }
        }
        return (double) amountSalaries / a;
    }
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public void salaryIndexationDepartament(double indexationPercentage, int department) {

        for (Employee employee : staffBook) {
            if (employee != null && employee.getDepartment() == department) {
                employee.setSalary((int) Math.round(employee.getSalary() * indexationPercentage / 100 + employee.getSalary()));
            }
        }
    }
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public void printDepartmentEmployees(int department) {

        for (int i = 0; i < staffBook.length; i++) {
            if (staffBook[i] != null && staffBook[i].getDepartment() == department) {
                System.out.println(staffBook[i].getFullName() + ";" + staffBook[i].getSalary());
            }
        }
    }

    public void printDepartmentEmployeesFullName(int department) {
        int a = 0;
        for (int i = 0; i < staffBook.length; i++) {
            if (staffBook[i] != null && staffBook[i].getDepartment() == department) {
                System.out.println(staffBook[i].getFullName());
                a++;
            }
        }
        if (a == 0) {
            System.out.println("Сотрудники отсутствуют");
        }
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public void listEemployeesLessSalary(int targetSalary) {

        for (int i = 0; i < staffBook.length; i++) {
            if (staffBook[i] != null && staffBook[i].getSalary() <= targetSalary) {
                System.out.println(staffBook[i].getFullName() + ";" + staffBook[i].getSalary() + ";" + staffBook[i].getId());
            }
        }
    }
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public void listEemployeesHigherSalary(int targetSalary) {

        for (int i = 0; i < staffBook.length; i++) {
            if (staffBook[i] != null && staffBook[i].getSalary() >= targetSalary) {
                System.out.println(staffBook[i].getFullName() + ";" + staffBook[i].getSalary() + ";" + staffBook[i].getId());
            }
        }
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public void deletingEmployee(int id) {
        for (int i = 0; i < staffBook.length; i++) {
            if (staffBook[i] != null && staffBook[i].getId() == id) {
                staffBook[i] = null;
            }
        }
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void deletingEmployeeFIO(String fullName, int id) {
        for (int i = 0; i < staffBook.length; i++) {
            if (staffBook[i] != null && staffBook[i].getId() == id && staffBook[i].getFullName() == fullName) {
                staffBook[i] = null;
            }
        }
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void employeeСhange(int id, int salary, int departmen) {
        for (int i = 0; i < staffBook.length; i++) {
            if (staffBook[i] != null && staffBook[i].getId() == id) {
                staffBook[i].setSalary(salary);
                staffBook[i].setDepartment(departmen);
            }
        }
    }

    public void employeeСhangeSalary(int id, int salary) {
        for (int i = 0; i < staffBook.length; i++) {
            if (staffBook[i] != null && staffBook[i].getId() == id) {
                staffBook[i].setSalary(salary);
            }
        }
    }

    public void employeeСhangeDepartmen(int id, int departmen) {
        for (int i = 0; i < staffBook.length; i++) {
            if (staffBook[i] != null && staffBook[i].getId() == id) {
                staffBook[i].setDepartment(departmen);
            }
        }
    }

    public void printListEmployeesDepartment() {
        for (int i = 1; i < 6; i++) {
            System.out.println("Depertment " + i);
            printDepartmentEmployeesFullName(i);

        }
    }


}







