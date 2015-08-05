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
public class IteratorDemo {
    public void start()
    {
        Books books = new Books();
        books.add("1984");
        books.add("BW");
        
        Comics comics = new Comics();
        comics.add("Marvel");
        comics.add("Avengers");
                
        Library library = new Library(books,comics);
        library.print(books.createIterator());
        library.print(comics.createIterator());
    }
}
