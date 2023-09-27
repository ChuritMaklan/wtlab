package main.java.com.company.Lab1.task15;

public class Book implements Comparable<Book>{
    protected String title;
    protected String author;
    protected int price;
    protected static int edition;
    protected int isbn;
    public Book(String title, String author, int price, int isbn){
        this.author = author;
        this.price = price;
        this.title = title;
        this.isbn = isbn;
    }
    public static int getEdition() {
        return edition;
    }
    public int getPrice() {
        return price;
    }
    public String getAuthor() {
        return author;
    }
    public String getTitle() {
        return title;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public static void setEdition(int edition) {
        Book.edition = edition;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public int getIsbn() {
        return isbn;
    }
    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    @Override
    public int compareTo(Book o) {
        return this.isbn - o.getIsbn();
    }
    @Override
    public Book clone(){
        return new Book(this.title, this.author, this.price, this.isbn);
    }
}
