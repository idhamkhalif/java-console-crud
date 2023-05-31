package CONSOLE;

import DB.DatabaseConnection;
import java.sql.*;

public class UpdateDB {
    static Connection conn;
    static PreparedStatement ps;
    static ResultSet rs;
    static String sql;
    
    public static void main(String[] args) throws SQLException {    
        conn = new DatabaseConnection().setConnection();
        try{
            sql = "UPDATE tbl_user SET email = ? WHERE id_user = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, "tirta.akdi@gmail.com");
            ps.setString(2, "US002");
            int rt = ps.executeUpdate();
        }catch(Exception e){
            System.out.println("Error"+e.getMessage());
        }
    }
}
// Jean, Sulthan, Akbar, Got'i, Ale, Hafizh, Roland, Suta, Aditya, Anggie, Ester, Casey
