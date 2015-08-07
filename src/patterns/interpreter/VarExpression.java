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
public class VarExpression implements Expression{
    private String name;
    private boolean val;

    public VarExpression(String name, boolean val) {
        this.name = name;
        this.val = val;
    }
    
       
    @Override
    public boolean evaluate() {
        return val;
    }
    
}
