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

// Department Factory
class DepartmentFactory {
    public static Department createDepartment(String type) {
        switch (type) {
            case "HR":
                return new HRDepartment();
            case "Finance":
                return new FinanceDepartment();
            case "IT":
                return new ITDepartment();
            default:
                throw new IllegalArgumentException("Unknown department type");
        }
    }
}