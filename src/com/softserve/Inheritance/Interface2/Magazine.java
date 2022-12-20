package com.softserve.Inheritance.Interface2;

import java.util.Objects;

public class Magazine implements Printable {
    private String title;

    public Magazine(String title) {
        this.title = title;
    }

    @Override
    public void print() {
        System.out.println("Print magazines with title: " + getTitle());
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
        Magazine magazine = (Magazine) o;
        return Objects.equals(title, magazine.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title);
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "title='" + title + '\'' +
                '}';
    }

    public static void printMagazines(Printable[] papers) {
        for (Printable paper :
                papers) {
            if (paper instanceof Magazine) {
                System.out.println(((Magazine) paper).getTitle());
            }
        }
    }
}
