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
public class FlyweightDemo {
    public void start()
    {
        ParticleModel model = new ParticleModel("red", 15);
        
        Particle [] particles = new Particle[3];
        for (int i = 0; i < particles.length; i++) {
            particles[i] = new Particle(i * 2, i + 1, model);
        }
        
        for (Particle particle : particles) {
            particle.drawParticle();
        }
    }
}
