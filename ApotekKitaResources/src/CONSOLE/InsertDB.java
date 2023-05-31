package CONSOLE;

import DB.DatabaseConnection;
import java.sql.*;

public class InsertDB {
    static Connection conn;
    static PreparedStatement ps;
    static ResultSet rs;
    static String sql;
    
    public static void main(String[] args) throws SQLException {    
        conn = new DatabaseConnection().setConnection();
        try{
            sql = "INSERT INTO tbl_user VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
            ps = conn.prepareStatement(sql);
            ps.setString(1, "US002");
            ps.setString(2, "Tirta");
            ps.setString(3, "12345");
            ps.setString(4, "M");
            ps.setString(5, "1992/03/09");
            ps.setString(6, "0812345");
            ps.setString(7, "tirta@gmail.com");
            ps.setString(8, "Solok, Padang");
            ps.setString(9, "user");
            int rt = ps.executeUpdate();
        }catch(Exception e){
            System.out.println("Error "+e.getMessage());
        }
    }
}
// Anggie, Akbar, Jean, Roland, Sulthan, Suta, Aditya, Hafizh, Got'i, Casey, Ale