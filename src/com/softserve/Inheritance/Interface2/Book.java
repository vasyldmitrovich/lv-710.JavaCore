package com.softserve.Inheritance.Interface2;

import java.util.Objects;

public class Book implements Printable {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    @Override
    public void print() {
        System.out.println("Print books with title: " + getTitle());
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(title, book.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                '}';
    }

    public static void printBooks(Printable[] papers) {
        for (Printable paper :
                papers) {
            if (paper instanceof Book) {
                System.out.println(((Book) paper).getTitle());
            }
        }
    }
}
