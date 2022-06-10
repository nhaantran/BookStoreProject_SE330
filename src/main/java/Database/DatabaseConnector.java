/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author nhaantran
 */
public class DatabaseConnector {
    public static Connection openConnection() throws SQLException {
        String url = "jdbc:sqlserver://LAPTOP-0HJSRM3N\\SQLEXPRESS:1433;databaseName=universitydb;encrypt=true;trustServerCertificate=true;";
        String unameDB = "sa";
        String passDB = "1285670243";

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); // load the driver for sqlserver
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        Connection con = DriverManager.getConnection(url, unameDB, passDB);
        Statement stm = con.createStatement();

        return con;

    }
}
