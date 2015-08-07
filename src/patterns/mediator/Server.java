/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.mediator;

/**
 *
 * @author Honza
 */
public class Server {
    public void processRequest(String req)
    {
        System.out.println("Processing request on url: " + req);
    }
    
    public void processResponse(String res)
    {
        System.out.println("Processing response: " + res);
    }
}
