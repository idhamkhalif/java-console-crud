package COMMITROLLBACK;

import DB.DatabaseConnection;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class CommitRollbackExample {
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
            ps.setString(1, "US009");
            ps.setString(2, "Tirta");
            ps.setString(3, "12345");
            ps.setString(4, "M");
            ps.setString(5, "1992/03/09");
            ps.setString(6, "0812345");
            ps.setString(7, "tirta@gmail.com");
            ps.setString(8, "Solok, Padang");
            ps.setString(9, "user");
            int rt = ps.executeUpdate();
            System.out.println("Data pertama di INSERT ke DB namun BELUM DI COMMIT");
            try{
                sql2 = "INSERT INTO tbl_user VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            ps = conn.prepareStatement(sql2);
            ps.setString(1, "US010");
            ps.setString(2, "Tirta");
            ps.setString(3, "12345");
            ps.setString(4, "M");
            ps.setString(5, "1992/03/09");
            ps.setString(6, "0812345");
            ps.setString(7, "tirta@gmail.com");
            ps.setString(8, "Solok, Padang");
            ps.setString(9, "user");
            int rtt = ps.executeUpdate();
            System.out.println("Data kedua di INSERT ke DB namun BELUM DI COMMIT");
            conn.commit();
            System.out.println("Data TELAH DI COMMIT, CEK DATABASE KAMU");
            }catch(Exception e){
                System.out.println("Error"+e.getMessage());
                conn.rollback();
                System.out.println("Data baris satu GAGAL DI COMMIT, DATA DI ROLLBACK! CEK DATABASE KAMU");
            }
        }catch(Exception e){
            System.out.println("Error"+e.getMessage());
            conn.rollback();
            System.out.println("Data baris dua GAGAL DI COMMIT, DATA DI ROLLBACK! CEK DATABASE KAMU");
        }
    }
}