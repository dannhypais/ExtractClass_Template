package com.pa.refatoring.extractclass.book;

public class Exercicio {
    private String title;
    private String author;
    private boolean isCheckedOut;
    private String borrower;

    public Exercicio(String title, String author) {
        this.title = title;
        this.author = author;
        this.isCheckedOut = false;
        this.borrower = null;
    }

    public void borrowBook(String borrower) {
        this.isCheckedOut = true;
        this.borrower = borrower;
    }

    public void returnBook() {
        this.isCheckedOut = false;
        this.borrower = null;
    }

    public String getDetails() {
        return title + " by " + author;
    }
}
