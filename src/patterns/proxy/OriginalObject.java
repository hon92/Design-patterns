/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.proxy;

/**
 *
 * @author Honza
 */
public class OriginalObject implements AbstractOriginal{
    private AbstractOriginal proxy;

    public OriginalObject() {
    }
    
    @Override
    public void action() {
        System.out.println("Origin working");
    }
    
}
