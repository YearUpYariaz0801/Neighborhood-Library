package com.pluralsight;

public class Book {
    private int id;
    private String ISBN;
    private String  title;
    private boolean isCheckedOut;
    private String checkedOutTo;


    public Book(int id, String title, String ISBN) {
        this.id = id;
        this.ISBN = ISBN;
        this.title = title;


        this.isCheckedOut = false;
        this.checkedOutTo = "";
    }

    public int getId() {
        return id;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getTitle() {
        return title;
    }

    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    public String getCheckoutOut() {
        return checkedOutTo;
    }
    public void checkOut(String name){
        this.checkedOutTo = name;
        this.isCheckedOut = true;
    }
    public void checkIn(){
        this.checkedOutTo = "";
        this.isCheckedOut = false;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", ISBN='" + ISBN + '\'' +
                ", title='" + title + '\'' +
                ", isCheckedOut=" + isCheckedOut +
                ", CheckedOuTo='" + checkedOutTo + '\'' +
                '}';
    }
}
