/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Bill;

import Database.DatabaseConnector;
import Database.IDao;
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
public class BillDao extends ModelAction<Bill> implements IDao<Bill>{

    public BillDao() {
        super();
    }
    public BillDao(Bill t) {
        super(t);
    }
    
    
    private Bill Create(ResultSet resultSet) throws SQLException {
        Bill std = new Bill();
        std.setID(String.valueOf(resultSet.getString("BookID")));
        std.setCustomerID(resultSet.getInt("CustomerID"));
        std.setDiscountID(resultSet.getInt("DiscountID"));
        std.setDate(resultSet.getString("Date"));
        std.setPrice(resultSet.getDouble("Price"));
        return std;
    }
    
    @Override
    public ArrayList<Bill> findAll() {
        String sql = "select * from Bill";
        try {
            // connect databse
            Connection con = DatabaseConnector.openConnection();
            Statement stm = con.createStatement();
            ResultSet resultSet = stm.executeQuery(sql);

            ArrayList<Bill> list = new ArrayList<>();

            while (resultSet.next()) {
                Bill std = Create(resultSet);
                list.add(std);

            }
            return list;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean add(Bill t) {
        String sql = "INSERT INTO Bill ("
                + "CustomerID, DiscountID, Date, Price) "
                + "VALUES(?,?,?,?) ";

        try ( Connection con = DatabaseConnector.openConnection();  PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setInt(1, t.getCustomerID());
            pstmt.setInt(2, t.getDiscountID());
            pstmt.setString(3, t.getDate());
            pstmt.setDouble(4, t.getPrice());
            
            return pstmt.executeUpdate()>0;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    
    @Override
    public boolean update(Bill t) {
        String sql = "Update Bill Set "
                + "CustomerID = ?, DiscountID = ?, Date = ?, Price = ? "
                + "where BillID = ?";
        try ( Connection con = DatabaseConnector.openConnection();  PreparedStatement pstmt = con.prepareStatement(sql);
                ) {
            pstmt.setInt(1, t.getCustomerID());
            pstmt.setInt(2, t.getDiscountID());
            pstmt.setString(3, t.getDate());
            pstmt.setDouble(4, t.getPrice());
            pstmt.setInt(5, Integer.valueOf(t.getID()));
            
            return pstmt.executeUpdate()>0;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    
    @Override
    public boolean delete(Bill t) {
        String sql = "Delete from Bill "
                + "where BillID = ?";
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
