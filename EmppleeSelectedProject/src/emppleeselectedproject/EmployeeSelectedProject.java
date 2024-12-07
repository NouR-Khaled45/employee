/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emppleeselectedproject;

/**
 *
 * @author khale
 */
public class EmployeeSelectedProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Singleton Usage
        PayrollSystem payrollSystem = PayrollSystem.getInstance();
        payrollSystem.processPayroll();

        DatabaseConnectionManager dbManager = DatabaseConnectionManager.getInstance();
        dbManager.connect();

        // Factory Pattern Usage - Employee Factory
        Employee emp1 = EmployeeFactory.createEmployee("Full-Time", "Alice");
        Employee emp2 = EmployeeFactory.createEmployee("Part-Time", "Bob");
        Employee emp3 = EmployeeFactory.createEmployee("Contractor", "Charlie");

        emp1.work();
        emp2.work();
        emp3.work();

        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp3);

        // Factory Pattern Usage - Department Factory
        Department hr = DepartmentFactory.createDepartment("HR");
        Department finance = DepartmentFactory.createDepartment("Finance");
        Department it = DepartmentFactory.createDepartment("IT");

        hr.handleDepartmentTasks();
        finance.handleDepartmentTasks();
        it.handleDepartmentTasks();

        System.out.println(hr);
        System.out.println(finance);
        System.out.println(it);
    }
    
}
