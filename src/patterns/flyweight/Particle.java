/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.flyweight;

/**
 *
 * @author Honza
 */
public class Particle {
    private int x,y;
    private ParticleModel model;

    public Particle(int x, int y, ParticleModel model) {
        this.x = x;
        this.y = y;
        this.model = model;
    }
    
    public void drawParticle()
    {
        System.out.println("Drawing particle on x:" + x + " y:" + y + " color:" + model.getColor() + " size:" + model.getSize());
    }
    
}
