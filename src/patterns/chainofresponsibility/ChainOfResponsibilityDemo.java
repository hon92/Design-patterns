/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.chainofresponsibility;

/**
 *
 * @author Honza
 */
public class ChainOfResponsibilityDemo {
    public void start()
    {
        Chain chain = new TestChain();
        Chain next = new EverythingChain();
        chain.setNextChain(next);
        
        chain.action("tesqter");
    }
}
