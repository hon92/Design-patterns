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
public class TestChain extends Chain{

    @Override
    public void action(String message) {
        if(message.contains("test"))
            System.out.println("TEST CHAIN END");
        else
        {
            if(nextChain != null)
            {
                nextChain.action(message);
            }
        }
    }
    
}
