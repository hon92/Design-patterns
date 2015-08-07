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
public abstract class Chain {
    protected Chain nextChain;

    public void setNextChain(Chain nextChain) {
        this.nextChain = nextChain;
    }
    
    
    
    public abstract void action(String message);
}
