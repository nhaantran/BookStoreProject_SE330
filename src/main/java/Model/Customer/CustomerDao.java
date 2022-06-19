/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Customer;

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
public class CustomerDao extends ModelAction<Customer> implements IDao<Customer>{

    public CustomerDao() {
        super();
    }
    public CustomerDao(Customer t) {
        super(t);
    }
    
    
    private Customer Create(ResultSet resultSet) throws SQLException {
        Customer std = new Customer();
        std.setID(String.valueOf(resultSet.getString("CustomerID")));
        std.setName(resultSet.getString("Name"));
        std.setPhone(resultSet.getString("Phone"));
        std.setRegisterDate(resultSet.getString("RegisterDate"));
        std.setTotal(resultSet.getDouble("Total"));
        return std;
    }

    /**
     * BUG "The statement did not return a result set."
     * @param t
     * @return 
     */
    @Override
    public Customer add(Customer t) {
        String sql = "INSERT INTO Customer ("
                + "Name, Phone, RegisterDate, Total) "
                + "VALUES(?,?,?,?) ";

        try ( Connection con = DatabaseConnector.openConnection();  PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setString(1, t.getName());
            pstmt.setString(2, t.getPhone());
            pstmt.setString(3, t.getRegisterDate());
            pstmt.setDouble(4, t.getTotal());
            try ( ResultSet resultSet = pstmt.executeQuery()) {
                if (resultSet.next()) {
                    Customer std = Create(resultSet);
                    return std;
                }else System.out.print("error!");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    @Override
    public ArrayList<Customer> findAll() {
        String sql = "select * from Customer";
        try {

            // connect databse
            Connection con = DatabaseConnector.openConnection();
            Statement stm = con.createStatement();
            ResultSet resultSet = stm.executeQuery(sql);

            ArrayList<Customer> list = new ArrayList<>();

            while (resultSet.next()) {
                Customer std = Create(resultSet);
                list.add(std);

            }
            return list;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
    @Override
    public Customer update(Customer t, String ID) {
        String sql = "Update Students Set "
                + "department = ? "
                + "where student_id = " + ID;
//        try ( Connection con = DatabaseConnector.openConnection();  PreparedStatement pstmt = con.prepareStatement(sql);
//                ResultSet resultSet = pstmt.executeQuery()) {
//            pstmt.setString(1, t.getDepartment());
//            pstmt.setString(2, t.getStudent_id());
//            System.out.println("Update student successfull!");
//            
//            Students std = Create(resultSet);
//            return std;
//            
//        } catch (SQLException ex) {
//            ex.printStackTrace();
//        }
        return null;
    }

    @Override
    public boolean delete(Customer t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    

    
    
}