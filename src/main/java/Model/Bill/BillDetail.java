/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Bill;

/**
 *
 * @author nhaantran
 */
public class BillDetail {
    private String BillID;
    private String BookName;
    private int Amount;
    private double Price;
    
    public BillDetail(){
        this.BillID = "";
        this.BookName = "";
        this.Amount = 0;
        this.Price = 0.0;
    }

    public BillDetail(String BillID, String BookName, int Amount, double Price) {
        this.BillID = BillID;
        this.BookName = BookName;
        this.Amount = Amount;
        this.Price = Price;
    }

    public String getBillID() {
        return BillID;
    }

    public void setBillID(String BillID) {
        this.BillID = BillID;
    }

    public String getBookName() {
        return BookName;
    }

    public void setBookName(String BookName) {
        this.BookName = BookName;
    }

    public int getAmount() {
        return Amount;
    }

    public void setAmount(int Amount) {
        this.Amount = Amount;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double Price) {
        this.Price = Price;
    }
    
    
    
    
}
