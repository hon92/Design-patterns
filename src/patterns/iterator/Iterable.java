/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.iterator;

/**
 *
 * @author Honza
 * @param <T>
 */
public interface Iterable<T>{
    Iterator<T> createIterator();
}
