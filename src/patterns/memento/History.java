/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.memento;

import java.util.ArrayList;

/**
 *
 * @author Honza
 */
public class History {
    private ArrayList<Memento> history;

    public History() {
        history = new ArrayList<>();
    }
    
    public Memento get(int index)
    {
        return history.get(index);
    }
    
    public void add(Memento m)
    {
        history.add(m);
    }
    
    
}
