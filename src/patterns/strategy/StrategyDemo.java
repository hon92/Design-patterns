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
public class StrategyDemo {
    private IAlgorithm algorithm;

    public StrategyDemo(IAlgorithm algorithm) {
        this.algorithm = algorithm;
    }

    public void setAlgorithm(IAlgorithm algorithm) {
        this.algorithm = algorithm;
    }
    
    public void start()
    {
        algorithm.runAlg();
    }
}
