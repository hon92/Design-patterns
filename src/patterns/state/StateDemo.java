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
public class StateDemo {
    public void start()
    {
        Player player = new Player();
        player.move();
        player.jump();
        player.move();
        player.fall();
        player.jump();
        
    }
}
