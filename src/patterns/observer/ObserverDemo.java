/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.observer;

/**
 *
 * @author Honza
 */
public class ObserverDemo {
    private Operator operator;
    
    public void start()
    {
        operator = new Operator();
        Client c1 = new Client("tom");
        Client c2 = new Client("joe");
        operator.addClient(c1);
        operator.addClient(c2);
        
        operator.newAction();
    }
    
}
