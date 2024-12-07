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
class ITDepartment extends Department {
    public ITDepartment() {
        this.departmentName = "IT";
    }

    @Override
    public void handleDepartmentTasks() {
        System.out.println("Handling IT-related tasks.");
    }
}
