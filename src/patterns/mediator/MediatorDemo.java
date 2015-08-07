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
public class MediatorDemo {
    public void start()
    {
        Server server = new Server();
        Request req1 = new Request(server, "seznam.cz");
        Response res = new Response("welcome", server);
        
        req1.start();
        res.start();
    }
}
