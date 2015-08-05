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
public class StandPlayerState extends PlayerState{

    public StandPlayerState(Player player) {
        super(player);
    }

    @Override
    public void move() {
        System.out.println("Move from stand");
        getPlayer().setCurrent(getPlayer().MOVING);
    }

    @Override
    public void jump() {
        System.out.println("jump from stand");
        getPlayer().setCurrent(getPlayer().JUMP);
    }
    
    
    
}
