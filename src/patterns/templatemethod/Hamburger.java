/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.templatemethod;

/**
 *
 * @author Honza
 */
public class Hamburger extends Food{

    @Override
    void make() {
        System.out.println("make hamburger");
    }
    @Override
    void addSomething() {
        System.out.println("add hamburger ingredients");
    }
    
}
