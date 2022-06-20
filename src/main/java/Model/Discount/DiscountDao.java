/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Discount;

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

/**
 *
 * @author nhaantran
 */
public class DiscountDao extends ModelAction<Discount> implements IDao<Discount>{

    public DiscountDao() {
        super();
    }
    public DiscountDao(Discount t) {
        super(t);
    }
    
    
    private Discount Create(ResultSet resultSet) throws SQLException {
        Discount std = new Discount();
        std.setID(String.valueOf(resultSet.getString("DiscountID")));
        std.setName(resultSet.getString("Name"));
        std.setValue(resultSet.getDouble("Value"));
        return std;
    }

    /**
     * BUG "The statement did not return a result set."
     * @param t
     * @return 
     */
    @Override
    public boolean add(Discount t) {
        String sql = "INSERT INTO Discount ("
                + "Name, Value) "
                + "VALUES(?,?) ";

        try ( Connection con = DatabaseConnector.openConnection();  PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setString(1, t.getName());
            pstmt.setDouble(2, t.getValue());
            return pstmt.executeUpdate()>0;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    public ArrayList<Discount> findAll() {
        String sql = "select * from Discount";
        try {

            // connect databse
            Connection con = DatabaseConnector.openConnection();
            Statement stm = con.createStatement();
            ResultSet resultSet = stm.executeQuery(sql);

            ArrayList<Discount> list = new ArrayList<>();

            while (resultSet.next()) {
                Discount std = Create(resultSet);
                list.add(std);

            }
            return list;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
    @Override
    public boolean update(Discount t) {
        String sql = "Update Discount Set "
                + "Name = ?, Value = ? "
                + "where DiscountID = ?";
        try ( Connection con = DatabaseConnector.openConnection();  PreparedStatement pstmt = con.prepareStatement(sql);
                ) {
            pstmt.setString(1, t.getName());
            pstmt.setDouble(2, t.getValue());
            pstmt.setInt(3, Integer.valueOf(t.getID()));
            
            return pstmt.executeUpdate()>0;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean delete(Discount t) {
        String sql = "Delete from Discount "
                + "where DiscountID = ?";
        try ( Connection con = DatabaseConnector.openConnection();  PreparedStatement pstmt = con.prepareStatement(sql);
                ) {
            pstmt.setInt(1, Integer.valueOf(t.getID()));
            
            return pstmt.executeUpdate()>0;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }
    

    
    
}