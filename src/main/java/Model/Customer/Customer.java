/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Customer;

import Model.Unit;

/**
 *
 * @author nhaantran
 */
public class Customer extends Unit{
    private String Phone;
    private String RegisterDate;
    private double Total;
    
    
    public Customer() {
        super();
        this.Phone = "";
        this.RegisterDate = "";
        this.Total = 0.0;
    }
    
    public Customer(String Phone, String RegisterDate, double Total, String Name, String ID) {
        super(Name, ID);
        this.Phone = Phone;
        this.RegisterDate = RegisterDate;
        this.Total = Total;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public String getRegisterDate() {
        return RegisterDate;
    }

    public void setRegisterDate(String RegisterDate) {
        this.RegisterDate = RegisterDate;
    }

    public double getTotal() {
        return Total;
    }

    public void setTotal(double Total) {
        this.Total = Total;
    }

   
    
    
    
}
