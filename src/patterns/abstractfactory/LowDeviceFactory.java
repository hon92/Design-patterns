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
public class LowDeviceFactory implements IDeviceFactory{

    @Override
    public IComputer createComputer() {
        return new AcerComputer();
    }

    @Override
    public IPhone createPhone() {
        return new ChinaMobile();
    }

    @Override
    public String getFactoryName() {
        return "Low prize factory";
    }
    
}
