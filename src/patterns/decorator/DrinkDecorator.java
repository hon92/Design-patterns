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
public abstract class DrinkDecorator implements Drink{

    private Drink drink;

    public DrinkDecorator(Drink drink) {
        this.drink = drink;
    }
    
    @Override
    public double getCost() {
        return drink.getCost();
    }

    @Override
    public String getName() {
        return drink.getName();
    }
    
}
