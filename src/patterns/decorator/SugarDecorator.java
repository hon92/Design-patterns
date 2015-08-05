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
public class SugarDecorator extends DrinkDecorator{

    public SugarDecorator(Drink drink) {
        super(drink);
    }

    @Override
    public double getCost() {
        return super.getCost() + 5;
    }

    @Override
    public String getName() {
        return super.getName() + " with sugar";
    }
    
    
    
    
    
}
