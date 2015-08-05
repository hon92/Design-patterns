/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.command;

/**
 *
 * @author Honza
 */
public interface IDevice {
    void on();
    void off();
    String getDescription();
}
