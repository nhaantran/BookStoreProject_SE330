/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Discount;

import Model.Unit;

/**
 *
 * @author nhaantran
 */
public class Discount extends Unit{
    private double Value;

    public Discount() {
        super();
        this.Value = Value;
    }
    
    public Discount(double Value, String Name, String ID) {
        super(Name, ID);
        this.Value = Value;
    }

    public double getValue() {
        return Value;
    }

    public void setValue(double Value) {
        this.Value = Value;
    }
    
    
}
