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
class Contractor extends Employee {
    public Contractor(String name) {
        super(name);
        this.employeeType = "Contractor";
    }

    @Override
    public void work() {
        System.out.println(name + " is working as a contractor.");
    }
}

