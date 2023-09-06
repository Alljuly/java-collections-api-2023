package main.java.list.search.lib;

public class Book {
    private String author;
    private String title;
    private int yearRealesed;

    public Book(String title, String author, int yearRealesed) {
        this.author = author;
        this.title = title;
        this.yearRealesed = yearRealesed;
    }

    public int getYearRealesed() {
        return yearRealesed;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", year=" + yearRealesed +
                '}';
    }

}