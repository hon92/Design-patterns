/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.visitor;

/**
 *
 * @author Honza
 */
public class VisitorDemo {
    
    public void start()
    {
        IDeviceVisitor deviceVisitor = new DeviceVisitor();
        IDevice device = new Computer();
        device.accept(deviceVisitor);
        
    }
}
