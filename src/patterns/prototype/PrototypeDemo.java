/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.prototype;

/**
 *
 * @author Honza
 */
public class PrototypeDemo {
    public void start()
    {
        GameObject go = new Enemy("enemy1");
        System.out.println(go);
        
        GameObject go2 = (GameObject) go.clone();
        System.out.println(go2);
        
    }
}
