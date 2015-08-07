/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.nullobject;

/**
 *
 * @author Honza
 */
public class NullObjectDemo {
    public void start()
    {
        Entity [] entities = new Entity[3];
        entities[0] = new BasicEnemy();
        entities[1] = new NullEntity();
        entities[2] = new BasicEnemy();
        
        for (Entity entity : entities) {
            entity.attack();
        }
                
    }
}
