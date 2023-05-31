package CONSOLE;

import DB.DatabaseConnection;
import java.sql.*;

public class SelectDB {
    static Connection conn;
    static PreparedStatement ps;
    static ResultSet rs;
    static String sql;
    // Sulthan, Jean, Ale, Hafizh, Suta, Got'i, Aditya
    public static void main(String[] args) throws SQLException {
        conn = new DatabaseConnection().setConnection();
        try {
            sql = "SELECT * FROM tbl_user WHERE id_user = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, "US001");
            rs = ps.executeQuery();
        } catch (Exception e) {
            System.out.println("Error" + e.getMessage());
        }
        while (rs.next()) {
            System.out.println(rs.getString(1) + "\n" + rs.getString(2) 
                    + "\n" + rs.getString(3) + "\n" + rs.getString(4)
                    + rs.getDate(5) + "\n" + rs.getString(6) + "\n" 
                    + rs.getString(7) + "\n" + rs.getString(8));
        }
    }
}
