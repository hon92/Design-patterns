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
public class AdapterDemo {
    public void start()
    {
        IKeyboard keyboard1 = new Keyboard();
        keyboard1.spaceBar();
        
        IKeyboard keyboard2 = new KeyboardAdapter(new Joypad());
        keyboard2.spaceBar();
        
    }
}
