package org.yup.neighborlibrary;

import java.util.ArrayList;
import java.util.Scanner;

public class Books {
    private int id;
    private String isbn;
    private String title;
    private String checkedOutTo;
    private boolean isCheckedOut;
    private boolean checkIn;
    private ArrayList<Books> books = new ArrayList();

    public Books(int id, String isbn, String title, String checkedOutTo) {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.checkedOutTo = checkedOutTo;
        this.isCheckedOut = isCheckedOut();
        this.checkIn = false;
    }

    public void checkOut(String name) {
        this.checkedOutTo = name;
    }

    public String getId() {
        return title + " ID: " + id + ".";
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isCheckedOut() {
        if (isCheckedOut) {
            this.getCheckedOutTo();
        }
        return isCheckedOut;
    }

    public void setCheckedOut(boolean checkedOut) {
        isCheckedOut = checkedOut;
    }

    public String getCheckedOutTo() {
        if(checkedOutTo.isEmpty()){
            return title + " is currently available. Would you like to check out?";
        }else{
            return "Sorry, " + title + " is not available. It is checked out to " + checkedOutTo + ".";
        }
    }

    public void setCheckedOutTo(String checkedOutTo) {
        this.checkedOutTo = checkedOutTo;
    }

    public boolean isCheckIn() {
        return checkIn;
    }

    public void checkIn() {
        System.out.println(checkedOutTo + " has checked in " + title + ".");
        checkedOutTo = "";
        isCheckedOut = false;
    }
}