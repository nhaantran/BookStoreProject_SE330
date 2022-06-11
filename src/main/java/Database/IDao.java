/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Database;

import java.util.ArrayList;

/**
 *
 * @author nhaantran
 * @param <T>
 */

public interface IDao<T> {
    ArrayList<T> printAll();
    T add(T t);
    T update(T t);
    boolean delete(T t);
    void printbyID(T t);
}
