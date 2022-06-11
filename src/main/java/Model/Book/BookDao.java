/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Book;

import Database.DatabaseConnector;
import Database.IDao;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author nhaantran
 */
public class BookDao implements IDao<Book> {

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
        return std;
    }

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

    public ArrayList<Book> printAll() {
        String sql = "select * from Book";
        try {

            // connect database
            Connection con = DatabaseConnector.openConnection();
            Statement stm = con.createStatement();
            ResultSet resultSet = stm.executeQuery(sql);

            ArrayList<Book> list = new ArrayList<>();
            // get ResultSet's meta data
            ResultSetMetaData metaData = resultSet.getMetaData();

            // display the column header in the ResultSet
            for (int i = 1; i <= metaData.getColumnCount(); i++) {
                System.out.printf("%-8s\t", metaData.getColumnName(i));
            }
            System.out.println();

            while (resultSet.next()) {
                Book std = Create(resultSet);
                list.add(std);
                for (int i = 1; i <= metaData.getColumnCount(); i++) {
                    System.out.printf("%-8s\t", resultSet.getObject(i));
                }
                System.out.println();
            }
            return list;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public Book add(Book t) {
        return null;
    }

    public Book update(Book t) {
        return null;
    }

    public boolean delete(Book t) {
        return false;
    }

    public void printbyID(Book t) {

    }
}
