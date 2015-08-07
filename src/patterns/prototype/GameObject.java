/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.prototype;

/**
 *
 * @author Honza
 */
public class GameObject implements Cloneable{
    private String name;
    private int id;

    public GameObject(String name) {
        this.name = name;
        this.id = hashCode();
    }

    @Override
    public String toString() {
        return super.toString() + " " + name + " " + id;
    }

    @Override
    protected Object clone() {
        try
        {
            return super.clone();
        }
        catch(CloneNotSupportedException e)
        {
            System.err.println(e.getMessage());
        }
        return null;
    }
    
    
    
    
}
