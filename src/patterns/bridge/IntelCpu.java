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
public class IntelCpu implements ComputerPart{

    
    @Override
    public void init() {
        System.out.println("Intel cpu init");
    }

    @Override
    public String getName() {
        return "Intel";
    }
    
}
