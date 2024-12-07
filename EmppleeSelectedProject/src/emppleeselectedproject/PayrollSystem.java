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
// Singleton for Payroll System
public class PayrollSystem {
    private static PayrollSystem instance;

    private PayrollSystem() {
        // private constructor
    }

    public static PayrollSystem getInstance() {
        if (instance == null) {
            synchronized (PayrollSystem.class) {
                if (instance == null) {
                    instance = new PayrollSystem();
                }
            }
        }
        return instance;
    }

    public void processPayroll() {
        System.out.println("Processing payroll...");
    }
}
