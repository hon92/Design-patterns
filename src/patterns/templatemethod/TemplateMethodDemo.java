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
public class TemplateMethodDemo {
    private Food food;

    public TemplateMethodDemo(Food food) {
        this.food = food;
    }

    public void setFood(Food food) {
        this.food = food;
    }
    
    public void start()
    {
        food.prepareFood();
    }
    
}
