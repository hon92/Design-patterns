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
public class ProxyObject implements AbstractOriginal{
    private AbstractOriginal original;

    public ProxyObject(AbstractOriginal original) {
        this.original = original;
    }
    
    @Override
    public void action() {
        preprocessing();
        original.action();
        postprocessing();
    }
    
    public void preprocessing()
    {
        System.out.println("Proxy preprocess");
    }
    public void postprocessing()
    {
        System.out.println("Proxy postprocess");
    }
    
}
