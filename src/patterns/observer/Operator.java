/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

/**
 *
 * @author Honza
 */
public class Operator extends Observable{

    private List<Client> clients;
    
    public Operator() {
        clients = new ArrayList<>();
    }
    
    public void newAction()
    {
        setChanged();
        notifyObservers();
    }
    
    public void addClient(Client client)
    {
        clients.add(client);
        addObserver(client);
    }
    
    
    
}
