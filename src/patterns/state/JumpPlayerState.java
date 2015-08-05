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
public class JumpPlayerState extends PlayerState{

    public JumpPlayerState(Player player) {
        super(player);
    }

    @Override
    public void fall() {
        System.out.println("Fall from jump");
        getPlayer().setCurrent(getPlayer().STAND);
    }
    
    
    
    
}
