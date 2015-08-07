/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.decorator;

/**
 *
 * @author Honza
 */
public class DecoratorDemo {
    public void start()
    {
        Drink d = new SugarDecorator(new CoffeeDrink());
        System.out.println(d.getCost() + " " + d.getName());
    }
}
