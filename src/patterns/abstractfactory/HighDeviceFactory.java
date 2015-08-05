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
public class HighDeviceFactory implements IDeviceFactory{

    @Override
    public IComputer createComputer() {
        return new MacComputer();
    }

    @Override
    public IPhone createPhone() {
        return new ApplePhone();
    }

    @Override
    public String getFactoryName() {
        return "High prize factory";
    }
    
}
