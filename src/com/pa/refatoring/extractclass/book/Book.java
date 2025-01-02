package com.pa.refatoring.extractclass.book;

public class Book {
    private String title;
    private String author;
    private BorrowingInfo borrowInfo;
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        borrowInfo = new BorrowingInfo();
    }
    public void borrowBook(String borrower) {
        borrowInfo.borrow(borrower);
    }
    public void returnBook() {
        borrowInfo.returnBorrowBook();
    }
    public String getDetails() {
        return title + " by " + author;
    }
}
