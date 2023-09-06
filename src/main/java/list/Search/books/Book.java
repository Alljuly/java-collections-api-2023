package main.java.list.Search.books;

public class Book {
    private String author;
    private String title;
    private int yearRealesed;

    public int getYearRealesed() {
        return yearRealesed;
    }

    public void setYearRealesed(int yearRealesed) {
        this.yearRealesed = yearRealesed;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Book(String author, String title, int yearRealesed) {
        this.author = author;
        this.title = title;
        this.yearRealesed = yearRealesed;
    }

    @Override
    public String toString() {
        return "Book [author=" + author + ", title=" + title + ", yearRealesed=" + yearRealesed + "]";
    }

}