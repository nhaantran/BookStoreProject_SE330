/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Book;

import Model.Model;
/**
 *
 * @author nhaantran
 */

public class Book extends Model {
    private String Description;
    private String National;
    private String Publisher;
    private String Supplier;
    private String BookCover;
    private String Author;
    private String Type;
    private int YearofPublish;
    private int NumPages;
    private double Price;

    public Book(){
        super();
        this.Description = "";
        this.National = "";
        this.Publisher = "";
        this.Supplier = "";
        this.BookCover = "";
        this.Author = "";
        this.Type = "";
        this.YearofPublish = 0;
        this.NumPages = 0;
        this.Price = 0.0;
    }
    
    public Book(String Description, String National, String Publisher, String Supplier, String BookCover, String Author, String Type, int YearofPublish, int NumPages, double Price, String ID) {
        super(ID);
        this.Description = Description;
        this.National = National;
        this.Publisher = Publisher;
        this.Supplier = Supplier;
        this.BookCover = BookCover;
        this.Author = Author;
        this.Type = Type;
        this.YearofPublish = YearofPublish;
        this.NumPages = NumPages;
        this.Price = Price;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public String getNational() {
        return National;
    }

    public void setNational(String National) {
        this.National = National;
    }

    public String getPublisher() {
        return Publisher;
    }

    public void setPublisher(String Publisher) {
        this.Publisher = Publisher;
    }

    public String getSupplier() {
        return Supplier;
    }

    public void setSupplier(String Supplier) {
        this.Supplier = Supplier;
    }

    public String getBookCover() {
        return BookCover;
    }

    public void setBookCover(String BookCover) {
        this.BookCover = BookCover;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String Author) {
        this.Author = Author;
    }

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public int getYearofPublish() {
        return YearofPublish;
    }

    public void setYearofPublish(int YearofPublish) {
        this.YearofPublish = YearofPublish;
    }

    public int getNumPages() {
        return NumPages;
    }

    public void setNumPages(int NumPages) {
        this.NumPages = NumPages;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double Price) {
        this.Price = Price;
    }
    
    
    
}
     