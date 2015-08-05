/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.observer;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author Honza
 */
public class Client implements Observer{
    private String name;
    
    public Client(String name) {
        this.name = name;
    }
    
    @Override
    public void update(Observable o, Object arg) {
        System.out.println(name + " updated");
    }
    
}
