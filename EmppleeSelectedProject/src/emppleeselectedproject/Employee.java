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

// Abstract Employee Class
abstract class Employee {
    protected String name;
    protected String employeeType;

    public Employee(String name) {
        this.name = name;
    }

    public abstract void work();

    @Override
    public String toString() {
        return "Employee{name='" + name + "', type='" + employeeType + "'}";
    }
}
