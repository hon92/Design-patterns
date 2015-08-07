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
public class OrExpression implements Expression{

    private Expression ex1;
    private Expression ex2;

    public OrExpression(Expression ex1, Expression ex2) {
        this.ex1 = ex1;
        this.ex2 = ex2;
    }

        
    @Override
    public boolean evaluate() {
        return ex1.evaluate() || ex2.evaluate();
    }
    
}
