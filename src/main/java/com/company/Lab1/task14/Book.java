package main.java.com.company.Lab1.task14;

public class Book {
    protected String title;
    protected String author;
    protected int price;
    protected static int edition;
    public Book(String title, String author, int price){
        this.author = author;
        this.price = price;
        this.title = title;
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

    @Override
    public String toString() {
        return "Title: " + title + "\nAuthor: " + author + "\nPrice" + price + "\nEdition" + edition + "\n";
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null || this.getClass() != obj.getClass()){
            return false;
        }
        if (this == obj){
            return true;
        }
        return this.title.equals(((Book)obj).getTitle()) &&
                this.author.equals(((Book)obj).getAuthor()) &&
                this.price == ((Book)obj).getPrice();
    }

    @Override
    public int hashCode() {
        return 31 * (31 * title.hashCode() + author.hashCode()) + price;
    }
    @Override
    public Book clone(){
        return new Book(this.title, this.author, this.price);
    }
}
