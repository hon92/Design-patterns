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
public class CPU extends Part{
    private int MHZ;
    
    public CPU(int MHZ, ComputerPart computerPart) {
        super(computerPart);
        this.MHZ = MHZ;
    }

    @Override
    public void initialization() {
        computerPart.init();
    }

    @Override
    public String getInfo() {
        return "CPU - " + computerPart.getName();
    }
    
}
