package CONSOLE;

import DB.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DeleteDB {
    static Connection conn;
    static PreparedStatement ps;
    static ResultSet rs;
    static String sql;
    
    public static void main(String[] args) throws SQLException {    
        conn = new DatabaseConnection().setConnection();
        try{
            sql = "DELETE FROM tbl_user WHERE id_user = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, "US003");
            int rt = ps.executeUpdate();
        }catch(Exception e){
            System.out.println("Error"+e.getMessage());
        }
    }
}
