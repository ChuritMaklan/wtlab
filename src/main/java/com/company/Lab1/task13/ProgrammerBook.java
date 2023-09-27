package main.java.com.company.Lab1.task13;

import main.java.com.company.Lab1.task12.Book;

public class ProgrammerBook extends Book{
    private int level;
    private String language;

    public ProgrammerBook(String title, String author, int price, int level, String language) {
        super(title, author, price);
        this.language = language;
        this.level = level;
    }

    public int getLevel() {
        return level;
    }
    public String getLanguage() {
        return language;
    }
    public void setLanguage(String language) {
        this.language = language;
    }
    public void setLevel(int level) {
        this.level = level;
    }
    @Override
    public String toString() {
        return "Title: " + title + "\nAuthor: " + author + "\nPrice: " + price + "\nLevel: " + level +
                "\nLanguage: " + language + "\nEdition" + edition + "\n";
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
                this.author.equals(((Book) obj).getAuthor()) &&
                this.price == ((Book) obj).getPrice() &&
                this.language.equals((((ProgrammerBook) obj).getLanguage())) &&
                this.level == ((ProgrammerBook) obj).getLevel();
    }

    @Override
    public int hashCode() {
        return 31 * (31 * (31 * (31 * title.hashCode() + author.hashCode()) + price) + level) + language.hashCode();
    }

}
