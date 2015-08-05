/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.command;

/**
 *
 * @author Honza
 */
public class Computer implements IDevice{
    private String description = "PC";
    
    @Override
    public void on() {
        System.out.println(description + " is on");
    }

    @Override
    public void off() {
        System.out.println(description + " is off");
    }

    @Override
    public String getDescription() {
        return description;
    }
    
}
