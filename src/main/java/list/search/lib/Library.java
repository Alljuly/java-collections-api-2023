package main.java.list.search.lib;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> bookList;

    public Library() {
        this.bookList = new ArrayList<>();
    }

    public void newBook(String title, String author, int yearRealesed) {
        bookList.add(new Book(title, author, yearRealesed));
    }

    public List<Book> searchAuthor(String author) {
        List<Book> searchB = new ArrayList<>();
        if (!bookList.isEmpty()) {
            for (Book b : bookList) {
                if (b.getAuthor().equalsIgnoreCase(author)) {
                    searchB.add(b);
                }
            }
            return searchB;
        } else {
            throw new RuntimeException("The list of books is empty!");
        }
    }

    public List<Book> searchYearInterval(int initialValue, int finalValue) {
        List<Book> searchB = new ArrayList<>();
        if (!bookList.isEmpty()) {
            for (Book b : bookList) {
                if (b.getYearRealesed() >= initialValue && b.getYearRealesed() <= finalValue) {
                    searchB.add(b);
                }
            }
            return searchB;
        } else {
            throw new RuntimeException("The list of books is empty!");
        }
    }

    public Book searchTitle(String title) {
        Book book = null;
        if (!bookList.isEmpty()) {
            for (Book b : bookList) {
                if (b.getTitle().equalsIgnoreCase(title)) {
                    book = b;
                    break;
                }
            }
            return book;
        } else {
            throw new RuntimeException("Not found!");
        }
    }

    public static void main(String[] args) {

        Library lib = new Library();

        lib.newBook("Código Limpo", "Robert C. Martin", 2009);

        lib.searchAuthor("Robert C. Martin");
        lib.searchTitle("Código Limpo");
        lib.searchYearInterval(2000, 2010);

    }
}
