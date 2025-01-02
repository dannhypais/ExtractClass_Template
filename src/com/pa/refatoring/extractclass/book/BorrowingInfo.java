package com.pa.refatoring.extractclass.book;

public class BorrowingInfo {
    private boolean isCheckedOut;
    private String borrower;
    public BorrowingInfo() {
        this.isCheckedOut = false;
        this.borrower = null;
    }
    public void borrow(String borrower) {
        this.isCheckedOut = true;
        this.borrower = borrower;
    }
    public void returnBorrowBook() {
        this.isCheckedOut = false;
        this.borrower = null;
    }
}
