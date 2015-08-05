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
public class CoffeeDrink implements Drink{

    @Override
    public double getCost() {
        return 35.5;
    }

    @Override
    public String getName() {
        return "Coffee";
    }
    
}
