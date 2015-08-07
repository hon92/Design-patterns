/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.bridge;

/**
 *
 * @author Honza
 */
public class BridgeDemo {
    public void start()
    {
        Part part = new CPU(2500, new IntelCpu());
        part.initialization();
        System.out.println(part.getInfo());
    }
}
