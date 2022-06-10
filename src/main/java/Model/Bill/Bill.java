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
    
    private String ManagerName;
    private String CustomerName;
    private double Price;
    private String Date;
    private ArrayList<BillDetail> Detail;

    public Bill(){
        this.ManagerName = "";
        this.CustomerName = "";
        this.Price = 0.0;
        this.Date = "";
        this.Detail = new ArrayList();
    }
    
    public Bill(String ManagerName, String CustomerName, double Price, String Date, ArrayList<BillDetail> Detail, String ID) {
        super(ID);
        this.ManagerName = ManagerName;
        this.CustomerName = CustomerName;
        this.Price = Price;
        this.Date = Date;
        this.Detail = Detail;
    }

    public String getManagerName() {
        return ManagerName;
    }

    public void setManagerName(String ManagerName) {
        this.ManagerName = ManagerName;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String CustomerName) {
        this.CustomerName = CustomerName;
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
