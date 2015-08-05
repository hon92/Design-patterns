/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.iterator;

import java.util.ArrayList;

/**
 *
 * @author Honza
 */
public class Books implements Iterable<String>{
    private ArrayList<String> booksList;

    public Books() {
        booksList = new ArrayList<>();
    }

    public void add(String bn)
    {
        booksList.add(bn);
    }
    
    @Override
    public Iterator<String> createIterator() {
        return new BookIterator();
    }
    
    private class BookIterator implements Iterator<String>
    {
        private int pos = 0;
        @Override
        public boolean hasNext() {
            return pos < booksList.size();
        }

        @Override
        public String next() {
            return booksList.get(pos++);
        }
        
        
    }
    
    
}
