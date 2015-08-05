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
public class DeviceVisitor implements IDeviceVisitor{

    @Override
    public void visit(Computer c) {
        System.out.println("Computer accepted");
    }
    
}
