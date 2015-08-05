/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.iterator;

/**
 *
 * @author Honza
 */
public class Comics implements Iterable<String>{
    private String [] comicsList;
    private int c = 0;

    public Comics() {
        comicsList = new String[10];
    }
    
    public void add(String cn)
    {
        if(c < comicsList.length)
        {
            comicsList[c++] = cn;
        }
    }

    @Override
    public Iterator<String> createIterator() {
        return new ComicsIterator();
    }
    
    private class ComicsIterator implements Iterator<String>
    {
        private int pos = 0;
        
        @Override
        public boolean hasNext() {
            return pos < comicsList.length && comicsList[pos] != null;
        }

        @Override
        public String next() {
            return comicsList[pos++];
        }
        
    }
    
}
