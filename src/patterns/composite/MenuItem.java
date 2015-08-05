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
public class MenuItem extends MenuComponent{

    private String desc;

    public MenuItem(String desc) {
        this.desc = desc;
    }
    
    @Override
    String getDescription() {
        return desc;
    }

    @Override
    void print() {
        System.out.println("MenuItem" + " - " + desc);
    }
    
    
    
}
