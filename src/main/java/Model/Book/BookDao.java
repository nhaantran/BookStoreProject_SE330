/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Book;

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
public class BookDao extends ModelAction<Book> implements IDao<Book>{

    public BookDao() {
        super();
    }
    public BookDao(Book t) {
        super(t);
    }
    
    
    private Book Create(ResultSet resultSet) throws SQLException {
        Book std = new Book();
        std.setID(String.valueOf(resultSet.getString("BookID")));
        std.setName(resultSet.getString("Name"));
        std.setDescription(resultSet.getString("Description"));
        std.setAuthor(resultSet.getString("Author"));
        std.setSupplier(resultSet.getString("Supplier"));
        std.setEdition(resultSet.getFloat("Edition"));
        std.setType(resultSet.getString("Type"));
        std.setBookCover(resultSet.getString("BookCover"));
        std.setReleaseDate(resultSet.getString("ReleaseDate"));
        std.setNumPages(resultSet.getInt("NumPages"));
        std.setPrice(resultSet.getDouble("Price"));
        std.setPublisher(resultSet.getString("Publisher"));
        return std;
    }

    /**
     * BUG "The statement did not return a result set."
     * @param t
     * @return 
     */
    @Override
    public boolean add(Book t) {
        String sql = "INSERT INTO Book ("
                + "Name, Description, Author, Supplier,Edition,Type,BookCover, ReleaseDate, NumPages, Price, Publisher) "
                + "VALUES(?,?,?,?,?,?,?,?,?,?,?) ";

        try ( Connection con = DatabaseConnector.openConnection();  PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setString(1, t.getName());
            pstmt.setString(2, t.getDescription());
            pstmt.setString(3, t.getAuthor());
            pstmt.setString(4, t.getSupplier());
            pstmt.setFloat(5, t.getEdition());
            pstmt.setString(6, t.getType());
            pstmt.setString(7, t.getBookCover());
            pstmt.setString(8, t.getReleaseDate());
            pstmt.setInt(9, t.getNumPages());
            pstmt.setDouble(10, t.getPrice());
            pstmt.setString(11, t.getPublisher());
            return pstmt.executeUpdate()>0;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    public ArrayList<Book> findAll() {
        String sql = "select * from Book";
        try {

            // connect databse
            Connection con = DatabaseConnector.openConnection();
            Statement stm = con.createStatement();
            ResultSet resultSet = stm.executeQuery(sql);

            ArrayList<Book> list = new ArrayList<>();

            while (resultSet.next()) {
                Book std = Create(resultSet);
                list.add(std);

            }
            return list;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
    
    @Override
    public boolean update(Book t) {
        System.out.println("Update: " + Integer.valueOf(t.getID()));
        System.out.println("Book info: "+t.toString());
        String sql = "Update Book Set "
                + "Name = ?, Description = ?, Author = ?, Supplier = ?"
                + ", Edition = ?, Type = ?, BookCover = ?, ReleaseDate = ?"
                + ", NumPages = ?, Price = ?, Publisher = ?"
                + "where BookID = " +  Integer.valueOf(t.getID());
        try ( Connection con = DatabaseConnector.openConnection();  PreparedStatement pstmt = con.prepareStatement(sql);
                ) {
            pstmt.setString(1, t.getName());
            pstmt.setString(2, t.getDescription());
            pstmt.setString(3, t.getAuthor());
            pstmt.setString(4, t.getSupplier());
            pstmt.setFloat(5, t.getEdition());
            pstmt.setString(6, t.getType());
            pstmt.setString(7, t.getBookCover());
            pstmt.setString(8, t.getReleaseDate());
            pstmt.setInt(9, t.getNumPages());
            pstmt.setDouble(10, t.getPrice());
            pstmt.setString(11, t.getPublisher());
            return pstmt.executeUpdate()>0;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean delete(Book t) {
        String sql = "Delete from Book "
                + "where BookID = ?";
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
