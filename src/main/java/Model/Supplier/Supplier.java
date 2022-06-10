/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Supplier;

import Model.Unit;

/**
 *
 * @author nhaantran
 */
public class Supplier extends Unit{
    
    private int NumofProducts;
    private String Email;
    

    public Supplier() {
        super();
        this.NumofProducts = 0;
        this.Email = "";
        
    }

    public Supplier(int NumofProducts, String Email, String Name, String ID) {
        super(Name, ID);
        this.NumofProducts = NumofProducts;
        this.Email = Email;
    }


    public int getNumofProducts() {
        return NumofProducts;
    }

    public void setNumofProducts(int NumofProducts) {
        this.NumofProducts = NumofProducts;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
    
}
