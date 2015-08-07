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
public class Response {
    private String data;
    private Server server;

    public Response(String data, Server server) {
        this.data = data;
        this.server = server;
    }
    
    public void start()
    {
        server.processResponse(data);
    }
}
