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
// Abstract Department Class
abstract class Department {
    protected String departmentName;

    public abstract void handleDepartmentTasks();

    @Override
    public String toString() {
        return "Department{name='" + departmentName + "'}";
    }
}

