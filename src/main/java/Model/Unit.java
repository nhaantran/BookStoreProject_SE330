/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author nhaantran
 */
public abstract class Unit extends Model{
    private String Name;

    public Unit() {
        super();
        this.Name = "";
    }
    

    public Unit(String Name, String ID) {
        super(ID);
        this.Name = Name;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }
    
    
}
