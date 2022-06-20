/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Bill;

import Model.Model;
import java.util.ArrayList;

/**
 *
 * @author nhaantran
 */
public class Bill extends Model{
    
    private int CustomerID;
    private int DiscountID;
    private double Price;
    private String Date;
    private ArrayList<BillDetail> Detail;

    public Bill(){
        this.CustomerID = 0;
        this.DiscountID = 0;
        this.Price = 0.0;
        this.Date = "";
        this.Detail = new ArrayList();
    }
    
    public Bill(int CustomerID, int DiscountID, double Price, String Date, ArrayList<BillDetail> Detail, String ID) {
        super(ID);
        this.CustomerID = CustomerID;
        this.DiscountID = DiscountID;
        this.Price = Price;
        this.Date = Date;
        this.Detail = Detail;
    }

    public int getCustomerID() {
        return CustomerID;
    }

    public void setCustomerID(int CustomerID) {
        this.CustomerID = CustomerID;
    }

    public int getDiscountID() {
        return DiscountID;
    }

    public void setDiscountID(int DiscountID) {
        this.DiscountID = DiscountID;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double Price) {
        this.Price = Price;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    public ArrayList<BillDetail> getDetail() {
        return Detail;
    }

    public void setDetail(ArrayList<BillDetail> Detail) {
        this.Detail = Detail;
    }
    
    
}
