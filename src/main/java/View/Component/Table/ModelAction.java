/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View.Component.Table;

import Model.Model;

/**
 *
 * @author nhaantran
 */
public class ModelAction<T> {
    private Model model;
    
    public ModelAction(Model model){
        this.model = model;
    }
    public ModelAction(){
        this.model = null;
    }
    
    public String getID(){
        return this.model.getID();
    }
}
