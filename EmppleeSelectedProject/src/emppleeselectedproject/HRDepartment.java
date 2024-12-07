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
class HRDepartment extends Department {
    public HRDepartment() {
        this.departmentName = "HR";
    }

    @Override
    public void handleDepartmentTasks() {
        System.out.println("Handling HR-related tasks.");
    }
}