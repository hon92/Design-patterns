/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.strategy;

/**
 *
 * @author Honza
 */
public class BasicAlgorithm implements IAlgorithm{

    @Override
    public int runAlg() {
        System.out.println("basic algorithm");
        return 1;
    }
    
}
