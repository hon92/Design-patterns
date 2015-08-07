/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.interpreter;

/**
 *
 * @author Honza
 */
public class NegativeExpression implements Expression{
    private Expression ex;

    public NegativeExpression(Expression ex) {
        this.ex = ex;
    }

    
    @Override
    public boolean evaluate() {
        return !ex.evaluate();
    }
    
}
