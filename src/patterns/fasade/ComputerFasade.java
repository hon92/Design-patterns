/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.fasade;

/**
 *
 * @author Honza
 */
public class ComputerFasade {
    private Ram ram;
    private CPU cpu;
    private Hdd hdd;

    public ComputerFasade(Ram ram, CPU cpu, Hdd hdd) {
        this.ram = ram;
        this.cpu = cpu;
        this.hdd = hdd;
    }
    
    public void RunComputer()
    {
        System.out.println("Starting computer");
        cpu.startProcedures();
        hdd.spinOn();
        ram.init();
        System.out.println("Computer is running");
    }
}
