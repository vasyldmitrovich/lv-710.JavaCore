package com.softserve.Inheritance.Interface2;

public class Test {
    public static void main(String[] args) {

        Printable[] papers = new Printable[4];
        {
            papers[0] = new Magazine("NYT");
            papers[1] = new Magazine("Vogue");
            papers[2] = new Book("Tom Sawyer");
            papers[3] = new Book("Old man and sea");

            for (Printable paper :
                    papers) {
                paper.print();
            }

        }
        Book.printBooks(papers);
    }
}

