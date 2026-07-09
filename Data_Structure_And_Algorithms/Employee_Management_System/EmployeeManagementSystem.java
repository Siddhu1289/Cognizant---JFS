public class EmployeeManagementSystem {

    private Employee[] employees = new Employee[10];
    private int count = 0;

    // Add Employee
    public void addEmployee(Employee employee) {

        if (count < employees.length) {
            employees[count] = employee;
            count++;
            System.out.println("Employee Added Successfully.");
        } else {
            System.out.println("Employee List is Full.");
        }

    }

    // Search Employee
    public Employee searchEmployee(int id) {

        for (int i = 0; i < count; i++) {

            if (employees[i].getEmployeeId() == id) {
                return employees[i];
            }

        }

        return null;
    }

    // Delete Employee
    public void deleteEmployee(int id) {

        int index = -1;

        for (int i = 0; i < count; i++) {

            if (employees[i].getEmployeeId() == id) {
                index = i;
                break;
            }

        }

        if (index != -1) {

            for (int i = index; i < count - 1; i++) {
                employees[i] = employees[i + 1];
            }

            employees[count - 1] = null;
            count--;

            System.out.println("Employee Deleted Successfully.");

        } else {

            System.out.println("Employee Not Found.");

        }

    }

    // Display Employees
    public void displayEmployees() {

        System.out.println("\nEmployee List");

        for (int i = 0; i < count; i++) {
            employees[i].display();
        }

    }

    // Main Method
    public static void main(String[] args) {

        EmployeeManagementSystem system = new EmployeeManagementSystem();

        system.addEmployee(new Employee(101, "Siddhu", "Software Engineer", 50000));

        system.addEmployee(new Employee(102, "Sindhu", "Tester", 45000));

        system.addEmployee(new Employee(103, "Ravi", "Manager", 70000));

        system.displayEmployees();

        System.out.println("\nSearching Employee...");

        Employee employee = system.searchEmployee(102);

        if (employee != null) {
            employee.display();
        } else {
            System.out.println("Employee Not Found");
        }

        System.out.println();

        system.deleteEmployee(103);

        system.displayEmployees();

    }
}