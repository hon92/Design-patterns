/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.templatemethod;

/**
 *
 * @author Honza
 */
public abstract class Food {
    
    final void prepareFood()
    {
        addSomething();
        make();
    }
    
    abstract void make();
    abstract void addSomething();
    
}
