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
    private String Status;
    private String Date;
    private String Address;
    private ArrayList<BillDetail> Detail;

    public Bill(){
        this.CustomerID = 0;
        this.DiscountID = 0;
        this.Status = " ";
        this.Date = "";
        this.Detail = new ArrayList();
        this.Address ="";
    }
    
    public Bill(int CustomerID, int DiscountID, String Status, String Date, ArrayList<BillDetail> Detail, String ID, String Address) {
        super(ID);
        this.CustomerID = CustomerID;
        this.DiscountID = DiscountID;
        this.Status = Status;
        this.Date = Date;
        this.Detail = Detail;
        this.Address = Address;
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

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
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

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }
    
    
}
