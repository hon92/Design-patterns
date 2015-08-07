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
public class ParticleModel {
    private String color;
    private int size;

    public ParticleModel(String color, int size) {
        this.color = color;
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public int getSize() {
        return size;
    }
    
    
}
