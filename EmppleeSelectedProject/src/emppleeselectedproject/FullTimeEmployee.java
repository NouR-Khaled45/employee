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

// Concrete Employee Types
class FullTimeEmployee extends Employee {
    public FullTimeEmployee(String name) {
        super(name);
        this.employeeType = "Full-Time";
    }

    @Override
    public void work() {
        System.out.println(name + " is working full-time.");
    }
}

class PartTimeEmployee extends Employee {
    public PartTimeEmployee(String name) {
        super(name);
        this.employeeType = "Part-Time";
    }

    @Override
    public void work() {
        System.out.println(name + " is working part-time.");
    }
}
