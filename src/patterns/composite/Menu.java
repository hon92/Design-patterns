/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.composite;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Honza
 */
public class Menu extends MenuComponent{
    private String desc;
    private ArrayList<MenuComponent> components;

    public Menu(String desc) {
        this.desc = desc;
        components = new ArrayList<>();
    }

    @Override
    void add(MenuComponent mc) {
        components.add(mc);
    }

    @Override
    void remove(MenuComponent mc) {
        components.remove(mc);
    }

    @Override
    MenuComponent getChild(int i) {
        return components.get(i);
    }
    
    @Override
    String getDescription() {
        return desc;
    }

    @Override
    void print() {
        System.out.println("Menu" + " - " + desc);
        
        for (MenuComponent next : components) {
            next.print();
        }
    }
    
    
    
    
}
