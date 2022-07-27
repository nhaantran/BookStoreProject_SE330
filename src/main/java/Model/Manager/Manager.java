/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Manager;

import Model.Unit;

/**
 *
 * @author nhaantran
 */
public class Manager extends Unit{
    private String Phone;
    private String Email;
    private String Password;
    
    public Manager() {
        super();
        this.Phone = "";
        this.Email = "";
        this.Password = "";
    }

    
    public Manager(String Phone, String Email, String Password, String Name, String ID) {
        super(Name, ID);
        this.Phone = Phone;
        this.Email = Email;
        this.Password = Password;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    
    
    
}
