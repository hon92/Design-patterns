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
public class CompositeDemo {
    public void start()
    {
        MenuComponent root = new Menu("Menu 1");
        root.add(new MenuItem("Submenu 1"));
        root.add(new MenuItem("Submenu 2"));
        MenuComponent menu2 = new Menu("Menu 2");
        root.add(menu2);
        menu2.add(new MenuItem("Submenu 2.1"));
        menu2.add(new MenuItem("Submenu 2.2"));
        root.add(new MenuItem("Submenu 3"));
        
        root.print();
    }
}
