/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.composite;

/**
 *
 * @author Honza
 */
public abstract class MenuComponent {
    void add(MenuComponent mc){throw new UnsupportedOperationException();}
    void remove(MenuComponent mc){throw new UnsupportedOperationException();}
    MenuComponent getChild(int i){throw new UnsupportedOperationException();}
    
    String getDescription(){throw new UnsupportedOperationException();}
    void print(){throw new UnsupportedOperationException();}
    
}
