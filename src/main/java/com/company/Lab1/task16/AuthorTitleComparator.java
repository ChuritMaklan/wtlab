package main.java.com.company.Lab1.task16;

import main.java.com.company.Lab1.task15.Book;

import java.util.Comparator;

public class AuthorTitleComparator implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        int compareTitles = o1.getAuthor().compareTo(o2.getAuthor()) ;
        if(compareTitles == 0){
            return o1.getTitle().compareTo(o2.getTitle());
        }
        return compareTitles;
    }
}
