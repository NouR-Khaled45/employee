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
class FinanceDepartment extends Department {
    public FinanceDepartment() {
        this.departmentName = "Finance";
    }

    @Override
    public void handleDepartmentTasks() {
        System.out.println("Handling finance-related tasks.");
    }
}