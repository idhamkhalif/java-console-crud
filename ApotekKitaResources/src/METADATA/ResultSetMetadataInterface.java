package METADATA;

import DB.DatabaseConnection;
import java.sql.*;

public class ResultSetMetadataInterface {

    static Connection conn;
    static ResultSet rs;
    static String sql;
    static ResultSetMetaData rsmd;

    public static void main(String[] args) {
        conn = new DatabaseConnection().setConnection();
        try {
            sql = "SELECT * FROM tbl_user";
            rs = conn.createStatement().executeQuery(sql);
             
            rsmd = rs.getMetaData();
            int kolom_di_tabel = rsmd.getColumnCount();
            System.out.printf("QUERY MENANGKAP %d KOLOM DARI TABEL\n",kolom_di_tabel);
            System.out.println("ANTARA LAIN:\n");
            for (int i=1;i<=kolom_di_tabel;i++) {
                String colName = rsmd.getColumnName(i);
                String colType = rsmd.getColumnTypeName(i);
                System.out.println(colName+"\t\t\tTIPE DATANYA ADALAH: "+colType);                 
            }
        } catch (Exception e) {
            System.out.println("Error" + e.getMessage());
        }
    }
}