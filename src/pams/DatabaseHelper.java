/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pams;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sam
 */
public class DatabaseHelper {
    public List<Object[]> getMedicineData() {
        List<Object[]> data = new ArrayList<>();
         String url = "jdbc:mysql://localhost:3307/pharmacy";
    String username = "root";
    String password = "password";
        try {
            Connection con = DriverManager.getConnection(url, username, password);
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT nameOfMedicine, quantity, initialPrice, selingPrice FROM pharma");

            while (rs.next()) {
                Object[] row = {
                    rs.getString("nameOfMedicine"),
                    rs.getInt("quantity"),
                    rs.getDouble("initialPrice"),
                    rs.getDouble("selingPrice")
                };
                data.add(row);
            }

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return data;
    }
    public boolean deleteMedicineRecord(Object[] rowData) {
        String url = "jdbc:mysql://localhost:3307/pharmacy";
        String username = "root";
        String password = "password";
        try {
            Connection con = DriverManager.getConnection(url, username, password);
            Statement stmt = con.createStatement();
            String sql = "DELETE FROM pharma WHERE nameOfMedicine = '" + rowData[0] + "'";
            int deletedRows = stmt.executeUpdate(sql);
            con.close();
            return deletedRows > 0; // Return true if at least one row was deleted
        } catch (Exception e) {
            e.printStackTrace();
            return false; // Return false if there was an exception
        }
    }
    
    
}
