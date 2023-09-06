package main.java.list.Search.books;

import java.util.*;

import main.java.list.Search.books.Book;

public class Library {
    List<Book> bookList;

    public Library() {
        this.bookList = new ArrayList<>();
    }

    public void newBook(String author, String title, int yearRealesed) {
        bookList.add(new Book(author, title, yearRealesed));
    }

    public void searchAuthor(String author) {
        List<Book> searchB = new ArrayList<>();
        if (!bookList.isEmpty()) {
            for (Book b : bookList) {
                if (b.getAuthor().equalsIgnoreCase(author)) {
                    searchB.add(b);
                }
            }
            System.out.println(searchB);
        } else {
            throw new RuntimeException("The list of books is empty!");
        }
    }

    public void searchYearInterval(int initialValue, int finalValue) {
        List<Book> searchB = new ArrayList<>();
        if (!bookList.isEmpty()) {
            for (Book b : bookList) {
                if (b.getYearRealesed() >= initialValue && b.getYearRealesed() <= finalValue) {
                    searchB.add(b);
                }
            }
            System.out.println(searchB);
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

    }
}
