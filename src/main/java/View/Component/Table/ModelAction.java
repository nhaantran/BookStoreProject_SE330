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
    private T model;
    
    public ModelAction(T model){
        this.model = model;
    }
    public ModelAction(){
        this.model = null;
    }
    public T getmodel(){
        return this.model;
    }
    
   
}
