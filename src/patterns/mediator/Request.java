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
public class Request {

    private Server server;
    private String url;
    
    public Request(Server server, String url) {
        this.server = server;
        this.url = url;
    }
    
    public void start()
    {
        server.processRequest(url);
    }
    
}
