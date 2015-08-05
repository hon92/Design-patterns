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
public class StartComputerCommand implements ICommand{
    private Computer computer;

    public StartComputerCommand(Computer computer) {
        this.computer = computer;
    }
    
    
    @Override
    public void execute() {
        computer.on();
    }
    
}
