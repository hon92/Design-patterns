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
public interface IDevice {
    void accept(IDeviceVisitor v);
}
