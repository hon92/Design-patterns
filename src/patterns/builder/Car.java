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
public class Car {
    private String name;
    private int horsePower;
    private int maxSpeed;

    private Car(CarBuilder cb) 
    {
        this.horsePower = cb.horsePower;
        this.name = cb.name;
        this.maxSpeed = cb.maxSpeed;
    }
    
    public void info()
    {
        System.out.println("Car " + name + " HP: " + horsePower + " Max Speed: " + maxSpeed);
    }
    
    
    public static class CarBuilder
    {
        private String name;
        private int horsePower;
        private int maxSpeed;
        
        public CarBuilder(String name , int hp) 
        {
            this.name = name;
            this.horsePower = hp;
            this.maxSpeed = 100;
        }

        public CarBuilder setMaxSpeed(int maxSpeed) {
            this.maxSpeed = maxSpeed;
            return this;
        }
        
        public Car build()
        {
            return new Car(this);
        }
        
    }
    
}
