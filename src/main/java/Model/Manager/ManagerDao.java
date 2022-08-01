/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Manager;

import Model.Discount.*;
import Model.Customer.*;
import Database.DatabaseConnector;
import Database.IDao;
import Model.Book.Book;
import View.Component.Table.ModelAction;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author nhaantran
 */
public class ManagerDao extends ModelAction<Manager> implements IDao<Manager>{

    public ManagerDao() {
        super();
    }
    public ManagerDao(Manager t) {
        super(t);
    }
    
    public boolean find(String account, char[] password){
        
            String sql = "select * from Manager"
                    + " where Email = '" + account + "'"
                    + " and Password = '" + String.valueOf(password) + "';";
            try {
                // connect databse

                Connection con = DatabaseConnector.openConnection();
                Statement stm = con.createStatement();
                ResultSet resultSet = stm.executeQuery(sql);

                if (resultSet.next()) {
                    return true;
                }

            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        
        return false;
    }
    
    
    
    
    
    private Manager Create(ResultSet resultSet) throws SQLException {
        Manager std = new Manager();
        
        std.setID(String.valueOf(resultSet.getString("ManagerID")));
        std.setName(resultSet.getString("Name"));
        std.setPhone(resultSet.getString("Phone"));
        std.setEmail(resultSet.getString("Email"));
        std.setPassword(resultSet.getString("Password"));
        
        return std;
    }
    
    

    @Override
    public ArrayList<Manager> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean add(Manager t) {
        String sql = "INSERT INTO Manager ("
                + "Name, Email, Password) "
                + "VALUES(?,?,?) ";

        try ( Connection con = DatabaseConnector.openConnection();  PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setString(1, t.getName());
            pstmt.setString(2, t.getEmail());
            pstmt.setString(3, t.getPassword());
            
            return pstmt.executeUpdate()>0;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean update(Manager t) {
        String sql = "Update Manager Set "
                + "Password = ?"
                + " where Email = " +  t.getEmail();
        try ( Connection con = DatabaseConnector.openConnection();  PreparedStatement pstmt = con.prepareStatement(sql);
                ) {
            pstmt.setString(1, String.valueOf(t.getPassword()));
            return pstmt.executeUpdate()>0;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean delete(Manager t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * BUG "The statement did not return a result set."
     * @param t
     * @return 
     */
    
    
    
}