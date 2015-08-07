/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.builder;

/**
 *
 * @author Honza
 */
public class BuilderDemo {
    public void start()
    {
        Car car = new Car.CarBuilder("BMW", 400).setMaxSpeed(350).build();
        car.info();
    }
}
