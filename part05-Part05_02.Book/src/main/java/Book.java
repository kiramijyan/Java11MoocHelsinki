/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hkira
 */
public class Book {
    
    private String author;
    private String title;
    private int pageCount;
    
    public Book(String author, String name, int pages){
        this.author = author;
        this.pageCount = pages;
        this.title = name;
    }
    
    public String getAuthor(){
        return this.author;
    }
    
    public String getName(){
        return this.title;
    } 
    
    public int getPages(){
        return this.pageCount;
    }
    
    /**
     *
     * @return
     */
    @Override
    public String toString(){
        
        return this.author + ", " + this.title + ", " + this.pageCount + " pages";
    }
}
