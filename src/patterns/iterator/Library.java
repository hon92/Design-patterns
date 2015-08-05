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
public class Library {
    private Books books;
    private Comics comics;

    public Library(Books books, Comics comics) {
        this.books = books;
        this.comics = comics;
    }
      
    public void print(Iterator iter)
    {
        while (iter.hasNext()){
            String name = (String) iter.next();
            System.out.println(name);
        }
    }
}
