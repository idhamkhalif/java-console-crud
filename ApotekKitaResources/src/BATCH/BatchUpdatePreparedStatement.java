package BATCH;

import DB.DatabaseConnection;
import java.sql.*;

public class BatchUpdatePreparedStatement {
    static Connection conn;
    static PreparedStatement ps;
    static ResultSet rs;
    static String sql, sql2;
    
    public static void main(String[] args) throws SQLException {    
        conn = new DatabaseConnection().setConnection();
        conn.setAutoCommit(false);
        try{
            sql = "INSERT INTO tbl_user VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
            ps = conn.prepareStatement(sql);
            ps.setString(1, "US015"); ps.setString(2, "Tirta");
            ps.setString(3, "12345"); ps.setString(4, "M");
            ps.setString(5, "1992/03/09"); ps.setString(6, "0812345");
            ps.setString(7, "tirta@gmail.com"); ps.setString(8, "Solok, Padang");
            ps.setString(9, "user");
            ps.addBatch();
            
            ps.setString(1, "US016"); ps.setString(2, "Tirta");
            ps.setString(3, "12345"); ps.setString(4, "M");
            ps.setString(5, "1992/03/09"); ps.setString(6, "0812345");
            ps.setString(7, "tirta@gmail.com"); ps.setString(8, "Solok, Padang");
            ps.setString(9, "user");
            ps.addBatch();
            int[] batch = ps.executeBatch();
            for(int i=0; i<batch.length; i++){
                System.err.println("Rows Affected by: "+(i+1)+""
                        + "INSERT STATEMENT: "+batch[i]);
            }
            conn.commit();
        }catch(BatchUpdateException e){
            System.out.println("Error"+e.getMessage());
        }catch(SQLException e){
            System.out.println("Error"+e.getMessage());
        }catch(Exception e){
            System.out.println("Error"+e.getMessage());
        }
    }
}// Sulthan, Akbar, Anggie, 