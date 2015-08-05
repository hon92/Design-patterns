/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.state;

/**
 *
 * @author Honza
 */
public class MovePlayerState extends PlayerState{

    public MovePlayerState(Player player) {
        super(player);
    }

    @Override
    public void jump() {
        System.out.println("Jump from move");
        getPlayer().setCurrent(getPlayer().JUMP);
    }

    @Override
    public void stand() {
        System.out.println("Stand from move");
        getPlayer().setCurrent(getPlayer().STAND);
    }
    
    
    
}
