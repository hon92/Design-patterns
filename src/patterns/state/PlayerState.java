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
public abstract class PlayerState {
    private Player player;

    public PlayerState(Player player) {
        this.player = player;
    }

    public Player getPlayer() {
        return player;
    }
    
    
    
    public void move(){}
    public void stand(){}
    public void jump(){}
    public void fall(){}
    
}
