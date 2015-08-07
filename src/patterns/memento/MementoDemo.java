/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.memento;

/**
 *
 * @author Honza
 */
public class MementoDemo {
    public void start()
    {
        Notes notes = new Notes();
        History history = new History();
        
        notes.setText("hello");
        history.add(notes.saveToHistory());
        notes.setText("h");
        notes.saveToHistory();
        notes.setFromMemento(history.get(0));
        System.out.println(notes.getText());
        
        
    }
}
