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
public class Player {

    public final PlayerState STAND = new StandPlayerState(this);
    public final PlayerState MOVING = new MovePlayerState(this);
    public final PlayerState JUMP = new JumpPlayerState(this);

    private PlayerState current = STAND;

    public Player() {
    }

    public void setCurrent(PlayerState current) {
        this.current = current;
    }

    public void move() {
        current.move();
    }

    public void stand() {
        current.stand();
    }

    public void jump() {
        current.jump();
    }

    public void fall() {
        current.fall();
    }

}
