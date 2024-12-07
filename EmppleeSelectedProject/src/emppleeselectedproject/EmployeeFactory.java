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
// Employee Factory
class EmployeeFactory {
    public static Employee createEmployee(String type, String name) {
        switch (type) {
            case "Full-Time":
                return new FullTimeEmployee(name);
            case "Part-Time":
                return new PartTimeEmployee(name);
            case "Contractor":
                return new Contractor(name);
            default:
                throw new IllegalArgumentException("Unknown employee type");
        }
    }
}
