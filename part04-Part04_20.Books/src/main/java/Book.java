/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bryan
 */
public class Book {
    private String title;
    private int pages;
    private int year;
    
    Book(String title, int pages, int year){
        this.title = title;
        this.pages = pages;
        this.year = year;
    }
    public String getTitle(){
        return this.title;
    }
    
    public int getNumOfPages(){
        return this.pages;
    }
    
    public int getYearPublished(){
        return this.year;
    }
    public String everything(){
        return this.title + ", " + this.pages + " pages, " + this.year;
    }
}
