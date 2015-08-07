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
public class EverythingChain extends Chain{

    @Override
    public void action(String message) {
        System.out.println("Everything chain end");
        
        if(nextChain != null)
            nextChain.action(message);
    }
    
}
