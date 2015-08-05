/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.abstractfactory;

/**
 *
 * @author Honza
 */
public class AbstractFactoryDemo {
    
    public void start()
    {
        IDeviceFactory deviceFactory = new HighDeviceFactory();
        
        IComputer computer = deviceFactory.createComputer();
        IPhone phone = deviceFactory.createPhone();
        
        System.out.println(deviceFactory.getFactoryName() + " " + computer.getName() + " " + phone.getNumber());
        
    }
}
