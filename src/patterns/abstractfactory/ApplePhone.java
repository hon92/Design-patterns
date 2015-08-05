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
public class ApplePhone implements IPhone{

    @Override
    public String getNumber() {
        return "999";
    }
    
}
