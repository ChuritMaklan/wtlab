package main.java.com.company.Lab1.task16;

import main.java.com.company.Lab1.task15.Book;

import java.util.Comparator;

public class AuthorTitlePriceComparator implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        int compareAuthors = o1.getAuthor().compareTo(o2.getAuthor()) ;
        if(compareAuthors == 0){
            int compareTitles =  o1.getTitle().compareTo(o2.getTitle());
            if(compareTitles == 0){
                return Integer.compare(o1.getPrice(), o2.getPrice());
            }
            return compareTitles;
        }
        return compareAuthors;
    }
}
