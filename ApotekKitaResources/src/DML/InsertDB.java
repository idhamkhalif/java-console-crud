package DML;

import DB.DatabaseConnection;
import java.sql.*;

public class InsertDB {
    static Connection conn;
    static Statement st;
    static String sql;
    public static void main(String[] args) throws SQLException {    
        conn = new DatabaseConnection().setConnection();
        try{
            sql = "INSERT INTO tbl_user VALUES ('0016', 'Idham', '123', 'F', '2000-12-13',"
                    + "'1111111', 'idham@gmail.com', 'Bekasi', 'admin');";
        }catch(Exception e){
            System.out.println("Error"+e.getMessage());
        }
        st = conn.createStatement();
        st.executeUpdate(sql);
    }
}
