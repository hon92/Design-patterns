/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.adapter;

/**
 *
 * @author Honza
 */
public class KeyboardAdapter implements IKeyboard{

    private IJoypad joypad;

    public KeyboardAdapter(IJoypad joypad) {
        this.joypad = joypad;
    }
    
    
    @Override
    public void leftArrow() {
        joypad.left();
    }

    @Override
    public void rightArrow() {
        joypad.right();
    }

    @Override
    public void spaceBar() {
        joypad.action();
    }

    @Override
    public void enter() {
        joypad.fire();
    }
    
}
