package DDL;
import DB.DatabaseConnection;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class AlterTable {
    static Connection conn;
    static Statement st;
    static String sql;

    public static void main(String[] args) throws SQLException {
        conn = new DatabaseConnection().setConnection();
        try{
            sql = "role VARCHAR(15)";
            }catch(Exception e){
            System.out.println("Error"+e.getMessage());
        }
        st = conn.createStatement();
        st.execute(sql);
    }
}
