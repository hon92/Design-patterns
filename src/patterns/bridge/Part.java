/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.bridge;

/**
 *
 * @author Honza
 */
public abstract class Part {
    protected ComputerPart computerPart;

    public Part(ComputerPart computerPart) {
        this.computerPart = computerPart;
    }
    
    public abstract void initialization();
    
    public abstract String getInfo();
    
}
