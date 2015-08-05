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
public class FasadeDemo {
    public void start()
    {
        CPU cpu = new CPU();
        Ram ram = new Ram();
        Hdd hdd = new Hdd();
        
        ComputerFasade computerFasade = new ComputerFasade(ram,cpu,hdd);
        computerFasade.RunComputer();
    }
}
