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
public class InterpreterDemo {
    public void start()
    {
        //a = true, b = false, c = true
        //(a & b) | (!c | b)
        
        Expression a = new VarExpression("a", true);
        Expression b = new VarExpression("b", false);
        Expression c = new VarExpression("c", true);
        
        Expression and = new AndExpression(a, b);
        
        Expression negC = new NegativeExpression(c);
        Expression innerOr = new OrExpression(negC, b);
        
        Expression or = new OrExpression(and, innerOr);
        
        System.out.println("Result of expression: (a & b) | (!c | b) a=1, b=0, c=1 -> " + or.evaluate());
        
    }
}
